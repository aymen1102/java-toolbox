package general.exceptionHandling.tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("What is your birth year ?");
            int yearOfBirth = scanner.nextInt();
            System.out.println(yearOfBirth);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } finally {
            System.out.println("ok");
        }
    }
}
