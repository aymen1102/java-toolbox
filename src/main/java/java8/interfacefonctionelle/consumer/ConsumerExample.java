package java8.interfacefonctionelle.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * The Consumer functional interface is part of the java.util.function package and represents an operation that takes
 * one argument and returns no value. It has a method called accept() which consumes a parameter of type T and returns nothing.
 * Consumer is mainly used to implement void-functional behaviors (operations that take an element and execute an action without returning a result).
 * The main advantage of using Consumer is that it allows great flexibility in performing various operations without the need to return a value.
 */
public class ConsumerExample {
    public static void main(String[] args) {
        //  Example 1
        Consumer<String> consumer1 = System.out::println;
        consumer1.accept("Toto");   // Toto

        //  Example 2
        Consumer<Integer> consumer2 = System.out::println;
        consumer2.accept(10);   // 10

        //  Example 3
        Consumer<List<Integer>> consumer3 = numberList -> {
            numberList.stream()
                    .map(x -> x * 2)
                    .forEach(System.out::print);
        };
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);
        consumer3.accept(numberList);     //2 4 6 8 10

        //  Example 4
        List<String> stringList = Arrays.asList("ABC", "N", "HO");
        Consumer<List<String>> consumer4 = list -> {
            list.stream()
                    .map(String::length)
                    .forEach(System.out::print);
        };
        consumer4.accept(stringList); //3 1 2
    }
}