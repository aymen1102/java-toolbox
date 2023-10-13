package java8.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsExample {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "apple", "cherry");

        // Using Collectors to get a list of unique fruits
        List<String> uniqueFruitsList = fruits.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("List of unique fruits: " + uniqueFruitsList);

        // Using Collectors to join elements of a stream
        String resultString = fruits.stream()
                .collect(Collectors.joining(", ", "Fruits: ", "."));
        System.out.println(resultString);

        // Using Collectors to group by elements and count occurrences
        Map<String, Long> fruitCount = fruits.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println("Count of fruits: " + fruitCount);

        // Using Collectors to partition the fruits into two groups: length below 6 and 6 or above
        Map<Boolean, List<String>> partitionedFruits = fruits.stream()
                .collect(Collectors.partitioningBy(f -> f.length() < 6));
        System.out.println("Partitioned fruits based on length: " + partitionedFruits);

        // Using Collectors to convert to a Set
        Set<String> fruitsSet = fruits.stream()
                .collect(Collectors.toSet());
        System.out.println("Set of fruits: " + fruitsSet);

        // Using Collectors to get average length of fruits
        double averageLength = fruits.stream()
                .collect(Collectors.averagingInt(String::length));
        System.out.println("Average length of fruits: " + averageLength);
    }
}
