package solid.liskovSubstitution;

/**
 * The Liskov Substitution Principle (LSP) is a concept in object-oriented programming that states objects of a superclass
 * should be replaceable with objects of its subclasses without affecting the correctness of the program.
 * In essence, it means that a subclass should behave in such a way that it can be used in place of its parent class
 * without causing unexpected behavior or violating the expectations of the parent class's behavior.
 * This principle promotes the design of classes that are interchangeable and ensures that derived classes
 * extend the base classes without changing their fundamental behavior.
 */
public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird ostrich = new Ostrich();
        makeBirdFly(sparrow); // Output: Sparrow can fly
        makeBirdFly(ostrich); // Output: Ostrich can't fly
    }

    // Function that takes a Bird object as a parameter and allows it to fly
    static void makeBirdFly(Bird bird) {
        bird.fly();
    }
}

