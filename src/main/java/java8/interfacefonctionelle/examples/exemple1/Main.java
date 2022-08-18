package java8.interfacefonctionelle.examples.exemple1;

public class Main {
    public static void main(String[] args) {
        FunctionalInterfaceExample functionalInterfaceExample =
                () -> System.out.println("Implémenation de ma méthode");
        functionalInterfaceExample.myFunction();
    }
}
