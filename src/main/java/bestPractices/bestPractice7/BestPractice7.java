package bestPractices.bestPractice7;

/** Using enum instead od Constant class */
public class BestPractice7 {
    /** bad habit */
    public static final int RED = 0xff0000;
    public static final int BLACK = 0x000000;
    public static final int WHITE = 0xffffff;

    public static void main(String[] args) {
        System.out.println(RED);
        System.out.println(BLACK);
        System.out.println(WHITE);

        System.out.println(Color.RED);
        System.out.println(Color.BLACK);
        System.out.println(Color.WHITE);
    }
}

