package java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

/**
 * A lambda expression, often simply called "lambda", is an anonymous function, i.e. a function without a name.
 * It was introduced in Java 8 to help implement the functional interface in a more concise, readable and expressive way.
 * It is mainly used to define inline interface implementations for functional methods. In Java, the functional interface
 * is an interface that contains a single abstract method. Lambda expressions are useful in various contexts,
 * notably in functional programming and when using the Stream API in Java to handle collections declaratively.
 */
public class LambdaExamples {
    public static void main(String[] args) {
        //Example 1
        Consumer<String> consumer =
                (String s) -> System.out.println(s);
        consumer.accept("Toto"); // Toto

        //Example 2
        Function<String, Integer> function = name -> name.length();
        Integer nameLength = function.apply("George");
        System.out.println(nameLength);   // 6

        //Example 3
        Predicate<String> predicate = value3 -> value3.startsWith("S");
        List<String> stringList = Arrays.asList("Alice", "Salim", "Salma");
        stringList.stream()
                .filter(predicate)
                .forEach(System.out::println); // Salim Salma

        //Example 4
        Supplier supplier = () -> "This is a supplier";
        System.out.println(supplier.get());

        //Example 5
        BinaryOperator<Integer> result = (Integer x, Integer y) -> x + y;
        System.out.println(result.apply(4, 2)); // 6
    }
}
