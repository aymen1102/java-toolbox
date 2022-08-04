package java11.collectionAPI.toArrayBefore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayBeforeExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Antoine");
        names.add("Marie");
        System.out.println(names);  // [Antoine, Marie]


        System.out.println("List to Array example in Java 8:");
        Object[] objects = names.toArray();
        System.out.println(Arrays.toString(objects));   // [Antoine, Marie]

        String[] array = names.toArray(new String[names.size()]);
        System.out.println(Arrays.toString(array));     // [Antoine, Marie]
    }
}
