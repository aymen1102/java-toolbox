package general.collections.map.treeMap;

import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMap in Java implements the NavigableMap interface, which in turn extends the SortedMap interface,
 * ensuring that keys are sorted according to their natural ordering or by a specified Comparator.
 * The primary feature to note about TreeMap is that it guarantees log(n) time cost for the containsKey,
 * get, put, and remove operations, due to its underlying Red-Black tree structure.
 * It's key-value pairs are ordered by their keys, making it an excellent choice when sorted key-value pairs are required.
 * Additionally, TreeMap provides handy methods like firstEntry(), lastEntry(), higherEntry(), and lowerEntry(),
 * allowing for precise navigation and retrieval within the sorted map.
 * It does not permit null keys and, like HashMap, it is not synchronized, which means it must be wrapped
 * with Collections.synchronizedSortedMap if a thread-safe sorted map is needed.
 */
public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap of numbers
        TreeMap<Integer, String> numbers = new TreeMap<>();

        // Inserting elements into the TreeMap
        numbers.put(10, "Ten");
        numbers.put(5, "Five");
        numbers.put(1, "One");
        numbers.put(7, "Seven");
        numbers.put(3, "Three");

        // Displaying the TreeMap which is naturally sorted by keys
        System.out.println("TreeMap: " + numbers);

        // Fetching the entry with the least key
        Map.Entry<Integer, String> firstEntry = numbers.firstEntry();
        System.out.println("Lowest key: " + firstEntry.getKey() + " => " + firstEntry.getValue());

        // Fetching the entry with the highest key
        Map.Entry<Integer, String> lastEntry = numbers.lastEntry();
        System.out.println("Highest key: " + lastEntry.getKey() + " => " + lastEntry.getValue());

        // Fetching a key-value mapping associated with the greatest key less than or equal to the given key
        Map.Entry<Integer, String> lowerEntry = numbers.lowerEntry(9);
        System.out.println("Entry with the greatest key less than 9: " + lowerEntry.getKey() + " => " + lowerEntry.getValue());

        // Fetching a key-value mapping associated with the least key greater than or equal to the given key
        Map.Entry<Integer, String> higherEntry = numbers.higherEntry(6);
        System.out.println("Entry with the least key greater than 6: " + higherEntry.getKey() + " => " + higherEntry.getValue());
    }
}
