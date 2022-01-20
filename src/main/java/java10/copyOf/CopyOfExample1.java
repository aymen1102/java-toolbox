package java10.copyOf;

import java.util.Arrays;

public class CopyOfExample1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};

        System.out.println("Defaut Array :");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]); // 1 2 3 4
        }

        int[] copyOfNumbers = Arrays.copyOf(numbers,5);
        copyOfNumbers[4] = 5;

        System.out.println("After using copyOf :");
        for (int i = 0; i < copyOfNumbers.length; i++) {
            System.out.println(copyOfNumbers[i]); // 1 2 3 4 5
        }
    }
}
