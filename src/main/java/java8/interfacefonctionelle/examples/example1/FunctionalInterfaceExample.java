package java8.interfacefonctionelle.examples.example1;

/**
 * A SAM (Single Abstract Method) interface is an interface containing a single abstract method.
 * These interfaces are fundamental to lambda expressions in Java 8.
 * Lambda expressions are essentially instances of SAM interfaces.
 * The introduction of the functional interface (or SAM) concept in Java 8 has simplified the use of the Stream API
 * and functional operations on data. Lambda expressions provide a concise implementation of this single abstract method.
 * The @FunctionalInterface annotation is a way of telling the compiler that this interface is intended to be a SAM interface.
 * If the interface does not respect the rules of a functional interface (for example, if it contains more than one abstract method),
 * the compiler will generate an error. Note that although the @FunctionalInterface annotation is recommended for greater clarity,
 * it is not mandatory.
 * n interface that respects the rules of a SAM interface is considered a functional interface even without this annotation.
 */
@FunctionalInterface
public interface FunctionalInterfaceExample {
    void myFunction();
}


