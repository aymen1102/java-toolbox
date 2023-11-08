package general.operators.ternaryOperator;

public class TernaryOperator {
    public static void main(String[] args) {
        int number1 = 5, number2 = 15, max, result;
        System.out.println("First number : " + number1);
        System.out.println("Second number :" + number2);

        System.out.println("Example 1 : ");
        max = (number1 > number2) ? number1 : number2;
        System.out.println("Maximum is : " + max);

        System.out.println("Exemple 2 : ");
        result = (number1 > number2) ? (number1 + number2) : (number1 - number2);
        System.out.println("Result : " + result);
    }
}
