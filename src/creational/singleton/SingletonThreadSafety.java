package creational.singleton;

public class SingletonThreadSafety {

    private static volatile SingletonThreadSafety instance;

    private SingletonThreadSafety() {
        // make default constructor private
    }

    public static synchronized SingletonThreadSafety getInstanceWithSynchronizedModifier() {
        // lazy initialization
        if (instance == null) {
            instance = new SingletonThreadSafety();
        }
        return instance;
    }

    public static SingletonThreadSafety getInstanceWithSynchronizedBlock() {
        // lazy initialization
        synchronized (SingletonThreadSafety.class) {
            if (instance == null) {
                instance = new SingletonThreadSafety();
            }
        }
        return instance;
    }

    public static synchronized SingletonThreadSafety getInstanceWithSynchronizedDoubleCheck() {
        // lazy initialization
        // this check is used to avoid unnecessary lock on class due to synchronize
        if (instance == null) {
            synchronized (SingletonThreadSafety.class) {
                if (instance == null) {
                    instance = new SingletonThreadSafety();
                }
            }
        }
        return instance;
    }

}

class SingletonThreadSafetyTest {
    public static void main(String[] args) {
        SingletonThreadSafety obj1 = SingletonThreadSafety.getInstanceWithSynchronizedModifier();
        SingletonThreadSafety obj2 = SingletonThreadSafety.getInstanceWithSynchronizedModifier();
        System.out.println(obj1 == obj2);

//        SingletonThreadSafety obj1 = SingletonThreadSafety.getInstanceWithSynchronizedBlock();
//        SingletonThreadSafety obj2 = SingletonThreadSafety.getInstanceWithSynchronizedBlock();
//        System.out.println(obj1 == obj2);
//
//        SingletonThreadSafety obj1 = SingletonThreadSafety.getInstanceWithSynchronizedDoubleCheck();
//        SingletonThreadSafety obj2 = SingletonThreadSafety.getInstanceWithSynchronizedDoubleCheck();
//        System.out.println(obj1 == obj2);
    }
}

// o/p: true