package java8.interfacefonctionelle.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Predicate is a predefined functional interface in the java.util.function.Predicate package.
 * It represents an operation that takes a single argument and returns a boolean value.
 * Usage: It is widely used to test a condition, often in conjunction with methods such as filter() on streams.
 * The lambda expression associated with a Predicate object primarily defines its test() method,
 * which evaluates this condition.
 * Main method: The test(T t) method is the abstract method of the Predicate interface.
 * It evaluates this condition on its argument and returns a boolean.
 */
public class PredicateExamples {

    public static void main(String[] args) {
        //  Example 1
        Predicate<Integer> predicate1 = value -> value % 2 == 0;
        System.out.println("Even number ? " + predicate1.test(8)); // true

        //  Example 2
        Predicate<Integer> predicate2 = value -> value % 2 == 1;
        List<Integer> integerList = Arrays.asList(2, 3, 5, 6, 9);
        integerList.stream()
                .filter(predicate2)
                .forEach(System.out::println); // 3 5 9

        //  Example 3
        Predicate<String> predicate3 = value -> value.startsWith("S");
        List<String> stringList = Arrays.asList("Alice", "Salim", "Salma");
        stringList.stream()
                .filter(predicate3)
                .forEach(System.out::println); // Salim Salma

        // Example 4
        Predicate<String> predicate4 = value -> value.length() == 2;
        List<String> stringWords = List.of("OK", "Hello");
        stringWords.stream().filter(predicate4).forEach(System.out::println); // OK
    }
}
