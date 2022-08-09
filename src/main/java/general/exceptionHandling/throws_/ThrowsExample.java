package general.exceptionHandling.throws_;

import java.io.IOException;

/**
 * In Java, exceptions allows us to write good quality codes where the errors are checked
 * at the compile time instead of runtime and we can create custom exceptions making the
 * code recovery and debugging easier.
 * - 	Java throws keyword is used in the method signature to declare an exception which might be thrown by the function while the execution of the code
 * -	Using throws keyword, we can declare both checked and unchecked exceptions.
 *      However, the throws keyword can be used to propagate checked exceptions only.
 * -    The throws keyword is followed by class names of Exceptions to be thrown.
 * -    throws is used with the method signature.
 * -    We can declare multiple exceptions using throws keyword that can be thrown by the method. For example, main() throws IOException, SQLException.
 */
public class ThrowsExample {

    public static void main(String[] args) throws Exception {
        throwsMethod3();   // "exception handled"
        throwsMethod0();    // java.lang.NullPointerException: Cannot invoke "String.toString()" because "name" is null
    }

    static void throwsMethod0() throws Exception {
        String name = null;
        name.toString();
    }

    static void throwsMethod1() throws IOException {
        throw new IOException("device error");//checked exception
    }

    static void throwsMethod2() throws IOException {
        throwsMethod1();
    }

    static void throwsMethod3() {
        try {
            throwsMethod2();
        } catch (Exception e) {
            System.out.println("exception handled");
            e.printStackTrace();
        }
    }
}
