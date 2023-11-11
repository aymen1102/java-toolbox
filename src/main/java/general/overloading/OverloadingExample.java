package general.overloading;

/**
 * In Java, two or more methods may have the same name if they differ in parameters
 * (different number of parameters, different types of parameters, or both).
 * These methods are called overloaded methods and this feature is called method overloading.
 */
public class OverloadingExample {

    public static void main(String[] args) {
        display(3);
        display("Good !");
    }

    private static void display(int number) {
        System.out.println("Argument : " + number);
    }

    private static void display(String text) {
        System.out.println("Argument : " + text);
    }
}
