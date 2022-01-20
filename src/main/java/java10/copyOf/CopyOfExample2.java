package java10.copyOf;

import java.util.Arrays;

public class CopyOfExample2 {
    public static void main(String[] args) {
        int[] T1 = { 2, 4, 5, 9, 5, 9 };

        int[] res = Arrays.copyOf(T1, 3); // [2, 4, 5]
        System.out.println(Arrays.toString(res));

        int[] res2 = Arrays.copyOf(T1, 10);
        System.out.println(Arrays.toString(res2)); // [2, 4, 5, 9, 5, 9, 0, 0, 0, 0]
    }
}
