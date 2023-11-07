package general.collections.list.vector;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

/**
 Difference between ArrayList and Vector
 Synchronization: Vector is synchronized, therefore thread-safe; ArrayList is non-synchronized, faster in monothread.
 Performance: Vector slower due to synchronization; ArrayList faster.
 Capacity: Vector doubles its capacity; ArrayList increases it by 50%.
 Inheritance: Vector inherits from AbstractList; ArrayList from AbstractCollection.
 Methods: Vector has additional methods not present in ArrayList.
 History: Vector is older; ArrayList introduced in JDK 1.2.
 Security: Vector for multithreading; ArrayList requires manual synchronization.
 */
public class VectorExample {
    public static void main(String[] args) {
        Vector<String> products = new Vector<>();
        products.add("Computer");
        products.add("Mouse");
        products.add("Keyboard");
        products.add("Screen");

        System.out.println("Vector: " +products); // [Computer, Mouse, Keyboard, Screen]

        String product1 = products.get(1);
        System.out.println("Element at index 1: " + product1); // Mouse

        products.set(1,"Printer");
        System.out.println("Vector: " +products); // [Computer, Printer, Keyboard, Screen]

        products.remove(3);
        System.out.println("Vector: " +products); // [Computer, Printer, Keyboard]

        int size = products.size();
        System.out.println("Size : "+size); // 3

        products.sort(Comparator.naturalOrder());
        System.out.println("Vector: " +products); // [Computer, Keyboard, Printer]

        boolean containsComputer = products.contains("Computer");
        System.out.println(containsComputer); //true

        boolean empty = products.isEmpty();
        System.out.println(empty); // false

        int indexOfComputer = products.indexOf("Computer");
        System.out.println(indexOfComputer); // 0

        Iterator<String> iterator = products.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
