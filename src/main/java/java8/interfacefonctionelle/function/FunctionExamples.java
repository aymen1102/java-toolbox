package java8.interfacefonctionelle.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * The Function interface is part of the java.util.function package.
 * It represents an operation that takes an argument of type T and returns a result of type R.
 * It is mainly used to convert or transform one value into another.
 * The main method of this interface is apply(T t), which takes a parameter of type T and returns a result of type R.
 * The Function interface is commonly used in functional programming, notably with stream methods such as map(),
 * to apply a transformation to each element of a stream.
 */
public class FunctionExamples {
    public static void main(String[] args) {
        // Example 1
        Function<String, Integer> function1 = x -> x.length();
        Integer nameLength = function1.apply("Aymen");
        System.out.println(nameLength);   // 5


        // Example 2
        Function<Integer, Integer> function2 = x -> x * 2;
        Integer lengthMultiplierPar2 = function1.andThen(function2).apply("Aymen");
        System.out.println(lengthMultiplierPar2);  // 10


        // Example 3
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Function<List<Integer>, List<Integer>> findEvenNumbers = evenNumbers -> {
            return numbers.stream()
                    .filter(x -> x % 2 == 0)
                    .toList();
        };
        System.out.println(findEvenNumbers.apply(numbers));     // [2, 4, 6, 8, 10]
    }
}
