package java8.interfacefonctionelle.examples.example1;

public class Main {
    public static void main(String[] args) {
        FunctionalInterfaceExample functionalInterfaceExample = () -> System.out.println("Here, implement the function");
        functionalInterfaceExample.myFunction();
    }
}
