package creational.singleton;

public class SingletonExample {

    private static SingletonExample instance;

    private SingletonExample() {
        // make default constructor private
    }

    public static SingletonExample getInstance() {
        // lazy initialization
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }
}

class SingletonExampleTest {
    public static void main(String[] args) {
        SingletonExample obj1 = SingletonExample.getInstance();
        SingletonExample obj2 = SingletonExample.getInstance();
        System.out.println(obj1 == obj2);
    }
}

// o/p: true