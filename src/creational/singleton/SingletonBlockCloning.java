package creational.singleton;

import java.io.*;

public class SingletonBlockCloning implements Cloneable {
    private static SingletonBlockCloning instance;

    private SingletonBlockCloning() {
        // make default constructor private
    }

    public static SingletonBlockCloning getInstance() {
        // lazy initialization
        if (instance == null) {
            instance = new SingletonBlockCloning();
        }
        return instance;
    }

    // implement this method to avoid serialization problems
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new CloneNotSupportedException("Singleton class not cloneable");
    }
}

class SingletonBlockCloningTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingletonBlockCloning obj1 = SingletonBlockCloning.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/ttn/Documents/singleton/serialized_obj.ser"));
        oos.writeObject(obj1);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/ttn/Documents/singleton/serialized_obj.ser"));
        SingletonBlockCloning obj2 = (SingletonBlockCloning) ois.readObject();

        System.out.println(obj1 == obj2);

        oos.close();
        ois.close();
    }
}
