package general.exceptionHandling.throwException;

/**
 * In Java, exceptions allows us to write good quality codes where the errors are checked
 * at the compile time instead of runtime and we can create custom exceptions making the
 * code recovery and debugging easier.
 * - Java throw keyword is used throw an exception explicitly in the code,
 * inside the function or the block of code.
 * - Type of exception Using throw keyword, we can only propagate unchecked exception i.e.,
 * the checked exception cannot be propagated using throw only.
 * - The throw keyword is followed by an instance of Exception to be thrown.
 * - throw is used within the method.
 * - We are allowed to throw only one exception at a time i.e. we cannot throw multiple  exceptions.
 */
public class ThrowExample {
    public static void main(String[] args) {
        //throwMethod1();
        //throwMethod2();
        validateAge(17);
    }

    static void throwMethod1() {
        throw new IllegalStateException("throw Exemple 1");
    }

    static void throwMethod2() {
        throw new RuntimeException("throw Exemple 2");
    }

    static void validateAge(int age) {
        if (age < 18) {
            //throw Arithmetic exception if not eligible to vote
            throw new ArithmeticException("Person is not eligible to vote");
        } else {
            System.out.println("Person is eligible to vote!!");
        }
    }
}
