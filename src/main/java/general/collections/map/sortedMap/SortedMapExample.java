package general.collections.map.sortedMap;

import java.util.*;

/**
 * SortedMap in Java is an interface that extends Map and ensures that the entries are maintained in ascending key order.
 * The most crucial point about SortedMap is that it provides a total ordering on its keys.
 * The interface has methods specific to sorted maps, such as
 * firstKey(), lastKey(), headMap(toKey), tailMap(fromKey), and subMap(fromKey, toKey),
 * which allow for easy retrieval of parts of the map. Implementations of SortedMap, like TreeMap,
 * are typically based on Red-Black trees, offering log(n) time cost for the containsKey, get, put, and remove operations.
 * It is important to note that the keys must be mutually comparable to be sorted,
 * which often means implementing the Comparable interface or providing a Comparator at map creation time.
 */
public class SortedMapExample {
    public static void main(String[] args) {
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put(2, "practice");
        sortedMap.put(3, "quiz");
        sortedMap.put(1, "code");
        sortedMap.put(4, "contribute");

        // The elements are automatically sorted by keys
        System.out.println("SortedMap: " + sortedMap);

        // Accessing the first (lowest) key
        System.out.println("First key: " + sortedMap.firstKey());

        // Accessing the last (highest) key
        System.out.println("Last key: " + sortedMap.lastKey());

        SortedMap<Integer, String> headMap = sortedMap.headMap(3);
        System.out.println("HeadMap before key 3: " + headMap);

        // Getting a view of the map after a certain key (inclusive)
        SortedMap<Integer, String> tailMap = sortedMap.tailMap(3);
        System.out.println("TailMap from key 3: " + tailMap);

        // Getting a view of the map between two keys (fromKey inclusive, toKey exclusive)
        SortedMap<Integer, String> subMap = sortedMap.subMap(2, 4);
        System.out.println("SubMap from key 2 to 4: " + subMap);

        Set set = sortedMap.entrySet();
        Iterator iterator = set.iterator();

        // Traversing map. Note that the traversal produced sorted (by keys) output
        while (iterator.hasNext()) {
            Map.Entry m = (Map.Entry) iterator.next();
            int key = (Integer) m.getKey();
            String value = (String) m.getValue();
            System.out.println("Key : " + key + "  value : " + value);
        }
    }
}
