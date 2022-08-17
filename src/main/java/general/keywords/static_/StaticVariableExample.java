package general.keywords.static_;

/** Static variables
 * When a variable is declared as static, then a single copy of the variable
 * is created and shared among all objects at the class level.
 * Static variables are, essentially, global variables.
 * All instances of the class share the same static variable.
 * Important points for static variables:
 * We can create static variables at the class level only. See here
 * static block and static variables are executed in the order they
 * are present in a program.
 */
public class StaticVariableExample {
    static int staticVariable = staticMethod();

    private static int staticMethod() {
        System.out.println("from staticMethod()");
        return 20;
    }

    static {
        System.out.println("Inside static block !");
    }

    public static void main(String[] args) {
        System.out.println("From main method");
        System.out.println("Value of the static variable : "+staticVariable);
    }
}
