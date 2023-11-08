package java11.predicateNot;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNot {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 5, 6, 9, 1);
        Predicate<Integer> isEven =
                number -> number % 2 == 0;
        numbers.stream()
                .filter(isEven)
                .forEach(System.out::println); // 2 6
        numbers.stream()
                .filter(isEven.negate())
                .forEach(System.out::println); // 5 9 1

        numbers.stream()
                .filter(Predicate.not(PredicateNot::isEven))
                .forEach(System.out::println); // 5 9 1
    }

    public static boolean isEven(Integer number) {
        return number % 2 == 0;
    }
}
