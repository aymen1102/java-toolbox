package general.overloading;

/**
 * In Java, two or more methods may have the same name if they differ in parameters (different number of parameters, different types of parameters, or both).
 * These methods are called overloaded methods and this feature is called method overloading.
 */
public class OverloadingExample {

    public static void main(String[] args) {
        display(3);
        display(3,2);
        display("Good !");
    }

    private static void display(int a){
        System.out.println("Argument :"+a);
    }

    private static void display(int a, int b){
        System.out.println("Arguments :"+a+","+b);
    }

    private static void display(String a){
        System.out.println("Argument :"+a);
    }
}
