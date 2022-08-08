package general.static_;

/**
 * The static keyword in Java is mainly used for memory management.
 * The static keyword in Java is used to share the same variable or method of a given class.
 * The users can apply static keywords with variables, methods, blocks, and nested classes.
 * The static keyword belongs to the class than an instance of the class.
 * The static keyword is used for a constant variable or a method that is the same for every instance of a class.
 * The static keyword is a non-access modifier in Java that is applicable for the following:
 * When a member is declared static, it can be accessed before any objects of its class are created, and without reference to any object.
 * Blocks
 * Variables
 * Methods
 * Classes
 * When to use static variables and methods?
 * Use the static variable for the property that is common to all objects. For example, in class Student, all students share the same college name.
 * Use static methods for changing static variables.
 * */
public class StaticBlockExample {

    static int a = 10;
    static int b;

    public static void main(String[] args) {
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
    }

    /*static block*/
    /*If you need to do the computation in order to initialize your static variables,
    you can declare a static block that gets executed exactly once, when the class is first loaded. */
    static {
        System.out.println("inside a static block !");
        b = a * 2;
    }
}
