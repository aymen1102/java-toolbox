package general.collections.set.linkedHashSet;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 HashSet is an implementation of the Set interface that does not guarantee the order of its elements,
 while LinkedHashSet maintains elements in the order they were inserted due to an internal doubly-linked list.
 LinkedHashSet consumes more memory than HashSet because of this linked list, but it provides a predictable iteration order.
 Choose HashSet if order is not important and you want to use less memory.
 Use LinkedHashSet if you need to maintain the insertion order of elements.
 */
public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Creating a LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Apple"); // This will be ignored since it's a duplicate

        // Displaying the LinkedHashSet elements
        // The elements would be displayed in the order they were inserted
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Removing an item from the LinkedHashSet
        linkedHashSet.remove("Mango");

        // Adding a new item to the LinkedHashSet
        linkedHashSet.add("Peach");

        // The order is maintained
        System.out.println("LinkedHashSet after removal and addition: " + linkedHashSet);
    }
}
