package bestPractices.bestPractice10;

/**
 * Never leave a Catch Blocks empty
 * It is a java best practice preferred by elite developers to write a proper and
 * meaningful message in the catch block while exception handling.
 * New developers often leave the catch block empty as initially they are the only
 * ones working on a code but when the exception is caught by the empty catch block,
 * when the program gets an exception, it does not show anything, making debugging harder and time-consuming.
 */
public class BestPractice10 {
    public static void main(String[] args) {
        /** exemple 1 */
        try {
            int number = 50 / 0;
            System.out.println(number);
        } catch (Exception e) {
            e.printStackTrace(); // java.lang.ArithmeticException: / by zero
        }

        /** exemple 2 */
        try {
            String[] cars = {"Peugeot", "Nissan", "Toyota"};
            System.out.println(cars[5]);
        } catch (Exception e) {
            e.printStackTrace(); // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        }
    }
}
