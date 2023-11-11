package general.recursion;

/**
 * Java Recursion
 * Recursion is the technique of making a function call itself.
 * This technique provides a way to break complicated problems down into simple problems which are easier to solve.
 */
public class RecursionExample {

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }

    public static int sum(int number) {
        if (number > 0) {
            return number + sum(number - 1);
        } else {
            return 0;
        }
    }
}
