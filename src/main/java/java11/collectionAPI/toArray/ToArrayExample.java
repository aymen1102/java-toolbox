package java11.collectionAPI.toArray;

import java.util.Arrays;
import java.util.List;

public class ToArrayExample {
    public static void main(String[] args) {
        List<String> names = List.of("Antoine","Marie");

        // Before
        System.out.println("List to Array example in Java 8:");
        String[] namesArray8 = names.toArray(new String[names.size()]);
        System.out.println(Arrays.toString(namesArray8));     // [Antoine, Marie]

        // After
        System.out.println("List to Array example in Java 11:");
        String[] namesArray11 = names.toArray(String[]::new);
        System.out.println(Arrays.toString(namesArray11));   // [Antoine, Marie]
    }
}
