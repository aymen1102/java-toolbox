package general.modifiers.static_;

/** Static variables
 * When a variable is declared as static, then a single copy of the variable is created and shared among all objects at the class level.
 * Static variables are, essentially, global variables. All instances of the class share the same static variable.
 * Important points for static variables:
 * We can create static variables at the class level only. See here
 * static block and static variables are executed in the order they are present in a program.
 * Below is the Java program to demonstrate that static block and static variables are executed in the order they are present in a program.
 */
public class StaticVariableExample {
    static int a = getA();

    static {
        System.out.println("Inside static block !");
    }

    private static int getA() {
        System.out.println("from getA();");
        return 20;
    }

    public static void main(String[] args) {
        System.out.println("From main method");
        System.out.println("Value of a :"+a);
    }
}
