package solid.interfaceSegregation;

/**
 * The Interface Segregation Principle (ISP) states that clients should not be forced to depend on interfaces they do not use.
 * In other words, an interface should not have more methods than a class implementing it needs.
 * In this example, we have an Worker interface with two methods: work and eat. However, not all classes that implement this interface need both methods.
 * The Robot class implements the Worker interface, but robots don't eat. So, the eat method in the Robot class is empty.
 * The Human class implements the Worker interface and both the work and eat methods are meaningful because humans both work and eat.
 * The Manager class, which is not a worker, uses the Worker interface to manage workers.
 * This adheres to the ISP because the Manager class only depends on the work method, not on the eat method.
 * By segregating the Worker interface into smaller, more focused interfaces (e.g., Workable and Eatable),
 * we could adhere more closely to the ISP, ensuring that classes only implement the methods they need, making the system more flexible and less coupled.
 */
// Class representing a Robot
class Robot implements Worker {
    public void work() {
        // Robot performs work
    }

    public void eat() {
        // Robots don't eat, so this method does nothing
    }
}

