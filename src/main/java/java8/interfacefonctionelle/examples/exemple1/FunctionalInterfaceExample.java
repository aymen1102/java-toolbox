package java8.interfacefonctionelle.examples.exemple1;

/**
 * A functional interface is an interface that contains only one abstract method.
 * They can have only one functionality to exhibit.
 * From Java 8 onwards, lambda expressions can be used to represent
 * the instance of a functional interface.
 * A functional interface can have any number of default methods.
 * Runnable, ActionListener, Comparable are some of the examples of functional interfaces.
 * Functional Interface is additionally recognized as Single Abstract Method Interfaces.
 * In short, they are also known as SAM interfaces.
 * Functional interfaces in Java are the new feature that provides users with
 * the approach of fundamental programming.
 */
@FunctionalInterface
public interface FunctionalInterfaceExample {
    static void staticMethod() {
        System.out.println("This is a static method !");
    }

    void myFunction();

    default void defaultMethod() {
        System.out.println("This is a default method !");
    }
}


