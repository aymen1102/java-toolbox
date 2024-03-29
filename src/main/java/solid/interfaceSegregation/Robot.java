package solid.interfaceSegregation;

/**
 * The Interface Segregation Principle (ISP), part of the SOLID principles in object-oriented design, states that no client
 * should be forced to depend on interfaces it does not use.
 * This principle advocates for creating smaller, more specific interfaces rather than large, general-purpose ones.
 * By doing so, it ensures that implementing classes only interact with the methods that are relevant to them, leading to
 * a more decoupled and maintainable codebase. ISP promotes focused, lean interfaces that enhance code readability and
 * reduce the impact of changes.
 */
class Robot implements Worker {
    public void work() {
        // Robot performs work
    }

    public void eat() {
        // Robots don't eat, so this method does nothing
        // in this case we should create new interface called Eater
    }
}

