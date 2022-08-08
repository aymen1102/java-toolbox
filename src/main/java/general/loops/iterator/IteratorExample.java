package general.loops.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> cityNames = Arrays.asList("New delhi","Paris","Osaka");
        Iterator iterator = cityNames.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());    // New delhi
                                                    // Paris
                                                    // Osaka
        }
    }
}
