package java8.interfacefonctionelle.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExamples {
    public static void main(String[] args) {
        // Exemple 1
        Function<String, Integer> getNameLength = x -> x.length();
        Integer nameLength = getNameLength.apply("Aymen");
        System.out.println(nameLength);   // 5


        // Exemple 2
        Function<Integer, Integer> multiplierPar2 = x -> x * 2;
        Integer lengthMultiplierPar2 = getNameLength.andThen(multiplierPar2).apply("Aymen");
        System.out.println(lengthMultiplierPar2);  // 10


        // Exemple 3
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Function<List<Integer>, List<Integer>> findPairNumbers = (pairNumbers) -> {
            pairNumbers = numbers.stream()
                    .filter(x -> x % 2 == 0)
                    .toList();
            return pairNumbers;
        };
        System.out.println(findPairNumbers.apply(numbers));     // [2, 4, 6, 8, 10]
    }
}
