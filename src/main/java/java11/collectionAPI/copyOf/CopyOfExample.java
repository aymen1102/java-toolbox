package java11.collectionAPI.copyOf;

import java.util.Arrays;
import java.util.List;

/**
 The copyOf method was introduced in Java 10 and is mainly used to create an unmodifiable copy of an existing collection.
 It is available in the List, Set and Map interfaces. This method takes an existing collection as an argument and returns
 a new collection that is immutable. This means that any attempt to modify this new collection will trigger an UnsupportedOperationException
 Arrays.copyOf is for arrays and creates mutable, while List.copyOf, Set.copyOf, and Map.copyOf are for collections and create immutable copies.
 Advantages:
 Immutability: prevents modification of the collection.
 Thread safety: being immutable, it is intrinsically safe for threads.
 Disadvantages:
 Memory consumption: creating a copy consumes additional memory.
 Unmodifiable: cannot be modified once created.
 */
public class CopyOfExample {
    public static void main(String[] args) {
        // Example 1
        int[] T1 = {2, 4, 5, 9, 5, 9};
        int[] res = Arrays.copyOf(T1, 3);
        System.out.println(Arrays.toString(res));   // [2, 4, 5]
        int[] res2 = Arrays.copyOf(T1, 10);
        System.out.println(Arrays.toString(res2)); // [2, 4, 5, 9, 5, 9, 0, 0, 0, 0]

        // Example 2
        int[] numbers = {1, 2, 3, 4};
        System.out.println("Default Array :"+ Arrays.toString(numbers)); // 1 2 3 4
        int[] copyOfNumbers = Arrays.copyOf(numbers, 5);
        System.out.println("Before using copyOf :"+ Arrays.toString(copyOfNumbers));  // 1 2 3 4 0
        copyOfNumbers[4] = 5;
        System.out.println("After using copyOf :"+ Arrays.toString(copyOfNumbers)); // 1 2 3 4 5

        // Example 3
        List<String> originalList = List.of("a", "b", "c");
        List<String> unmodifiableList = List.copyOf(originalList);
        System.out.println(unmodifiableList);   // [a, b, c]
        // unmodifiableList.add("d"); cannot add element UnsupportedOperationException

        // Example 4
        char[] alphabet = {'A', 'B', 'C', 'D', 'E'};
        System.out.println(alphabet); // ABCDE
        char[] copyOfAlphabet = Arrays.copyOf(alphabet, 8);
        System.out.println(Arrays.toString(copyOfAlphabet)); // [A, B, C, D, E,  ,  ,  ]
        copyOfAlphabet[5] = 'F';
        System.out.println(Arrays.toString(copyOfAlphabet)); // [A, B, C, D, E, F,  ,  ]
        alphabet[5] = 'F';
        System.out.println(Arrays.toString(alphabet)); // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    }
}
