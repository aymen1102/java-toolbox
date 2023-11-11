package java8.interfacefonctionelle.examples.example2;

public class Main {
    public static void main(String[] args) {
        FunctionalInterfaceExample functionalInterface =
                (a, b) -> a * b;
        System.out.println("Result : " + functionalInterface.multiply(2, 4));   // 8
    }
}
