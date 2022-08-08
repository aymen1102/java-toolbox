package oop.encapsulation;

/**
 * The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
 * To achieve this, you must:
 * declare class variables/attributes as private
 * provide public get and set methods to access and update the value of a private variable
 */
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
