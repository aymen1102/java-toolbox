package solid.liskovSubstitution;

/**
 * The Liskov Substitution Principle states that an object of a derived (child) class should be able to
 * substitute for an object of the base (parent) class without causing the program to lose its correctness.
 * In this example, we have an abstract class Bird with an abstract method fly to represent bird flight.
 * Two child classes, Sparrow and Ostrich, inherit from the Bird class. The Sparrow can fly, so it implements
 * the fly method, while the Ostrich cannot fly, so its fly method does nothing.
 * The makeBirdFly function takes a Bird object as a parameter and calls its fly method.
 * We can see that we can pass both a Sparrow and an Ostrich object to this function without causing the program to lose its correctness.
 * This demonstrates adherence to the Liskov Substitution Principle, as derived objects (Sparrow and Ostrich)
 * can be substituted for base class objects (Bird) without issues.
 */
public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird ostrich = new Ostrich();

        makeBirdFly(sparrow); // Output: Sparrow can fly
        makeBirdFly(ostrich); // Output: (No output, as ostrich cannot fly)
    }

    // Function that takes a Bird object as a parameter and allows it to fly
    static void makeBirdFly(Bird bird) {
        bird.fly();
    }
}

