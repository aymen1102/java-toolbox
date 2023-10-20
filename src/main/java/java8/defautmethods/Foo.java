package java8.defautmethods;

public interface Foo {

    void display();

    static void staticMethod() {
        System.out.println("Ici j'ai implémenté une méthode statique");
    }

    default void defaultMethod() {
        System.out.println("Ici j'ai implémenté une méthode par défaut");
    }

}
