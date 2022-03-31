package best_practices.best_practice_7;

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

enum Color{
    /** best practice */
    BLACK(0x000000), WHITE(0x000000), RED(0xff0000);
    private int code;
    Color(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }
}