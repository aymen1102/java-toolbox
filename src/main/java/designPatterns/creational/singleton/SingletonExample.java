package designPatterns.creational.singleton;

public class SingletonExample {
    private static SingletonExample singletonExample = null;

    // private constructor
    private SingletonExample() {
    }

    public static SingletonExample getInstance() {
        //Si c'est la première instanaciation
        if (singletonExample == null) {
            singletonExample = new SingletonExample();
        }
        //Si c'est la deuxieme instanaciation
        return singletonExample;
    }

    public static void main(String[] args) {
        SingletonExample singleton0 = SingletonExample.getInstance();
        SingletonExample singleton1 = SingletonExample.getInstance();
        /**
         * c'est le même hashcode cad que ça pointe vers le même espace mémoire
         * */
        System.out.println("Hashcode de l'objet singleton0 est : " + singleton0.hashCode());
        System.out.println("Hashcode de l'objet singleton1 est : " + singleton1.hashCode());
        /**
         * ça montre donc que c'est le même objet
         * */
        if (singleton0.hashCode() == singleton1.hashCode()) {
            System.out.println(
                    "Two objects point to the same memory location and  to the same object");
        }
    }
}
