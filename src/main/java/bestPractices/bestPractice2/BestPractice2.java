package bestPractices.bestPractice2;

/** Using enhanced for loops instead of for loops with counter
 * Generally, it won’t make any difference to use either of them but in some cases, the counter variable used could be very error-prone.
 * The counter variable can incidentally get altered, it may get used later in the code or you may start the index from 1 instead of 0
 * which will result in disturbing the code at multiple points. To eliminate this, enhanced for loop is a good option. */
public class BestPractice2 {
    public static void main(String[] args) {
        String[] names = {"Jenny","Lorine","Sarah"};

        /** bad habit */
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        /** best practice */
        for (String name : names){
            System.out.println(name);
        }
    }
}
