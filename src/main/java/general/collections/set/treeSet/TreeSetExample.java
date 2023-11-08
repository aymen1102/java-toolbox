package general.collections.set.treeSet;

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet in Java is an implementation of the SortedSet interface that uses a Red-Black tree for storage.
 * The key feature of a TreeSet is that it stores elements in sorted, ascending order according to their natural ordering,
 * or by a Comparator provided at set creation.
 * All elements inserted into the set must implement the Comparable interface (if natural ordering is used) or
 * be comparable by the provided Comparator to maintain order.
 * TreeSet offers logarithmic time complexity for common operations such as add, remove, and contains.
 * It's beneficial when you require a collection to maintain order and provide efficient retrieval.
 * However, it does not allow null elements and is not synchronized, which means it is not thread-safe without external synchronization.
 */
public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet
        Set<String> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add("Mango");
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Peach");

        // The elements will be stored in natural (alphabetical) order
        System.out.println("TreeSet: " + treeSet);

        // Trying to add a duplicate element
        treeSet.add("Apple"); // This will be ignored as sets do not allow duplicates

        // The TreeSet remains sorted after adding elements
        System.out.println("Updated TreeSet: " + treeSet);

        // Removing an item
        treeSet.remove("Banana");

        // Iterating over the TreeSet elements
        System.out.println("TreeSet after removal: ");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }
    }
}