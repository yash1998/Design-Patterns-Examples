package creational.singleton;

import java.io.*;

public class SingletonSerializationProblemExample implements Serializable {
    private static SingletonSerializationProblemExample instance;

    private SingletonSerializationProblemExample() {
        // make default constructor private
    }

    public static SingletonSerializationProblemExample getInstance() {
        // lazy initialization
        if (instance == null) {
            instance = new SingletonSerializationProblemExample();
        }
        return instance;
    }

    // implement this method to avoid serialization problems
    public Object readResolve() {
        return instance;
    }
}

class SingletonSerializationProblemExampleTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingletonSerializationProblemExample obj1 = SingletonSerializationProblemExample.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/ttn/Documents/singleton/serialized_obj.ser"));
        oos.writeObject(obj1);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/ttn/Documents/singleton/serialized_obj.ser"));
        SingletonSerializationProblemExample obj2 = (SingletonSerializationProblemExample) ois.readObject();

        System.out.println(obj1 == obj2);

        oos.close();
        ois.close();
    }
}
