package general.classe.abstraction;

/**
 * An interface cannot have instance variables.
 * An interface cannot have a constructor.
 * Static methods are allowed starting from Java 8.
 * A class can implement multiple interfaces.
 * An interface cannot provide the implementation of an abstract class.
 * An interface is only allowed to extend another Java interface.
 * The members of a Java interface are public by default.
 * An interface can only have abstract methods. In Java 8 and later versions,
 * it has become possible to define default methods and implement them directly in an interface.
 * Additionally, interfaces can have static methods since Java 8.
 */
public interface Animal {
    static void sleep() {
        System.out.println("sleeping");
    }

    void walk();

    ;

    default void eat() {
        System.out.println("eating");
    }

    ;
}
