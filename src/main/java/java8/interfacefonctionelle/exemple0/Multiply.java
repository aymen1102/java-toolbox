package java8.interfacefonctionelle.exemple0;

public class Multiply {
    public static void main(String[] args) {
        MyFunctionalInterface Total = (a, b) -> a*b;
        System.out.println("Résultat:"+Total.multiply(2,4));
    }
}
