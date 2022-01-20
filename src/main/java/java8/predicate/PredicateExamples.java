package java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExamples {

    public static void main(String[] args) {
        //Exemple 1
        Predicate<Integer> predicate1 = value1 -> value1 % 2 == 1;
        int value1 = 9;
        System.out.println("Nombre impair ? "+ predicate1.test(value1)); // true

        //Exemple2
        Predicate<Integer> predicate2 = value2 -> value2 % 2 == 1;
        List<Integer> integerList = Arrays.asList(2,3,5,6,9);
        integerList.stream().filter(predicate2).forEach(System.out::println); // 3 5 9

        //Exemple3
        Predicate<String> predicate3 = value3 -> value3.startsWith("S");
        List<String> stringList = Arrays.asList("Alice","Salim","Salma");
        stringList.stream().filter(predicate3).forEach(System.out::println); // Salim Salma
    }
}
