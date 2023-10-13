package java17.records;

import java17.records.Person;

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

