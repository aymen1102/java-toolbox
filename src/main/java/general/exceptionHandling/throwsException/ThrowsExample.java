package general.exceptionHandling.throwsException;

/**
 * In Java, exceptions allows us to write good quality codes where the errors are checked
 * at the compile time instead of runtime and we can create custom exceptions making the
 * code recovery and debugging easier.
 * Java throws keyword is used in the method signature to declare an exception which might be thrown
 * by the function while the execution of the code
 * Using throws keyword, we can declare both checked and unchecked exceptions.
 * However, the throws keyword can be used to propagate checked exceptions only.
 * The throws keyword is followed by class names of Exceptions to be thrown.
 * throws is used with the method signature.
 * We can declare multiple exceptions using throws keyword that can be thrown by the method.
 * For example, main() throws IOException, SQLException.
 */
public class ThrowsExample {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Exception handled in main: " + e);
        }
    }

    public static void method1() throws Exception {
        throw new Exception("Exception from method1");
    }
}



class Main {
    public static void main(String[] args) throws Exception {
        dangerousMethod();
    }
    public static void dangerousMethod() throws Exception {
        throw new IllegalStateException("This is an exception.");
    }
}
