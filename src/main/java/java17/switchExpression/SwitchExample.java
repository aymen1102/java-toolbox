package java17.switchExpression;

public class SwitchExample {

    public static void main(String[] args) {
        // Before
        int num = 2;
        String result1;
        switch (num) {
            case 1:
                result1 = "One";
                break;
            case 2:
                result1 = "Two";
                break;
            case 3:
                result1 = "Three";
                break;
            default:
                result1 = "Unknown";
                break;
        }

        // After
        String result2 = switch (num) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            default -> "Unknown";
        };

    }

}
