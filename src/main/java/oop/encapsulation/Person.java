package oop.encapsulation;

/**
 This is the first cornerstone of OOP, aimed at wrapping data (variables) and code (functions/methods) in a single unit - the object.
 Encapsulation protects data integrity by preventing direct access to a class's attributes and forcing the use of access methods (getters and setters).
 In this way, data is protected from unwanted access and modification.*/
public class Person {

    private String name;  // private = restricted access

    public Person(String name) {
        this.name = name;
    }

    /**
     * Get and Set
     * private variables can only be accessed within the same class (an outside class has no access to it).
     * However, it is possible to access them if we provide public get and set methods.
     * The get method returns the variable value, and the set method sets the value.
     * Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case:
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
