package general.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This block of code generate an exception if you enter a String
        //System.out.println("What is your birth month ?");
        //int monthOfBirth = scanner.nextInt();
        //System.out.println(monthOfBirth);

        try {
            System.out.println("What is your birth year ?");
            int yearOfBirth = scanner.nextInt();
            System.out.println(yearOfBirth);
        } catch (InputMismatchException e){
            System.out.println("Your birth year is wrong !");
            e.printStackTrace();
        }  finally {
            System.out.println("ok");
        }
    }
}
