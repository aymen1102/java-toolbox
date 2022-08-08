package bestPractices.best_practice_4;

/** Use Underscores in lengthy Numeric Literals
 This feature was introduced in Java 7 that helps in writing lengthy numeric literals in a much more readable way.
 So instead of writing in the old and common way like this */
public class  BestPractice4 {

    static int number = 58356823;
    static int numberWithUnderscore = 58_356_823;

    public static void main(String[] args) {
        System.out.println(number);  //58356823
        System.out.println(numberWithUnderscore); //58356823
    }
}
