package designPatterns.creational.singleton;

public class SingletonExample {
    private static SingletonExample singletonExample = null;

    // private constructor
    private SingletonExample() {
    }

    public static SingletonExample getInstance() {
        if (singletonExample == null) {
            singletonExample = new SingletonExample();
        }
        return singletonExample;
    }

    public static void main(String[] args) {
        SingletonExample singleton0 = SingletonExample.getInstance();
        SingletonExample singleton1 = SingletonExample.getInstance();
        if (singleton0 == singleton1) {
            System.out.println("singleton0 and singleton1 are the same object.");
        } else {
            System.out.println("singleton0 and singleton1 are different.");
        }
    }
}
