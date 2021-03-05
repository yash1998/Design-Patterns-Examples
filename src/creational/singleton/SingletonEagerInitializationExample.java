package creational.singleton;

public class SingletonEagerInitializationExample {

    // early initialization(only useful when it is sure that if the object will be used at least once)
    private static final SingletonEagerInitializationExample instance = new SingletonEagerInitializationExample();

    private SingletonEagerInitializationExample() {
        // make default constructor private
    }

    public static SingletonEagerInitializationExample getInstance() {
        return instance;
    }
}

class SingletonEagerInitializationExampleTest {
    public static void main(String[] args) {
        SingletonEagerInitializationExample obj1 = SingletonEagerInitializationExample.getInstance();
        SingletonEagerInitializationExample obj2 = SingletonEagerInitializationExample.getInstance();
        System.out.println(obj1 == obj2);
    }
}

// o/p: true