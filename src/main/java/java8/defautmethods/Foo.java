package java8.defautmethods;

public interface Foo {

    static void staticMethod() {
        System.out.println("Ici j'ai implémenté une méthode statique");
    }

    void display();

    default void defaultMethod() {
        System.out.println("Ici j'ai implémenté une méthode par défaut");
    }

}
