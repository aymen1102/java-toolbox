package java17.records;

/**
 * Records in Java 17 are a language feature that allows you to create immutable data classes (without setters)
 * in a more concise and robust way.
 * They are particularly useful for classes whose main purpose is to store data without modifying its behavior.
 * Records automatically generate methods such as equals(), hashCode() and toString().
 * Advantages:
 * Immutability: All instance variables are final by default.
 * Simplicity: Less boilerplate code.
 * Readability: Cleaner, easier-to-understand code.
 * Data integrity: since data is immutable, it is safer in a multithreaded environment.
 */
public class RecordExample {

    public static void main(String[] args) {
        // Creating an instance of the Person record
        Person person = new Person("John", 30);

        // Accessing fields in the record
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());

        // Using toString() method
        System.out.println("Person: " + person);

        // Creating another instance for equality check
        Person anotherPerson = new Person("John", 30);

        // Using equals() method
        System.out.println("Equal: " + person.equals(anotherPerson));

        // Using hashCode() method
        System.out.println("Hash Code: " + person.hashCode());
    }
}

