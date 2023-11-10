package general.modifiers.default_.method;

public interface Foo {
    static void staticMethod() {
        System.out.println("Here, i implemented a static method");
    }

    default void defaultMethod() {
        System.out.println("Here, i implemented a default method");
    }

    void simpleMethod();
}
