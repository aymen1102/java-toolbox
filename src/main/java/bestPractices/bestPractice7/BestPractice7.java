package bestPractices.bestPractice7;

/**
 * Using enum instead of Constant class
 */
public class BestPractice7 {
    /**
     * bad habit
     */
    public static final int RED = 0x000001;
    public static final int BLACK = 0x000002;
    public static final int WHITE = 0x000003;

    public static void main(String[] args) {
        System.out.println(RED);
        System.out.println(BLACK);
        System.out.println(WHITE);

        System.out.println(Color.RED.getCode());
        System.out.println(Color.BLACK.getCode());
        System.out.println(Color.WHITE.getCode());
    }
}

