package general.map.sortedmap;

import java.util.*;

public class SortedMapExample {
    public static void main(String[] args) {
        SortedMap<Integer, String> sm
                = new TreeMap<Integer, String>();
        sm.put(2, "practice");
        sm.put(3, "quiz");
        sm.put(5, "code");
        sm.put(4, "contribute");

        Set s = sm.entrySet();
        // Using iterator in SortedMap
        Iterator i = s.iterator();

        // Traversing map. Note that the traversal
        // produced sorted (by keys) output .
        while (i.hasNext()) {
            Map.Entry m = (Map.Entry)i.next();

            int key = (Integer)m.getKey();
            String value = (String)m.getValue();

            System.out.println("Key : " + key
                    + "  value : " + value);
        }
    }
}
