package general.collections.list.vector;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Vector;

/**
 * ArrayList and Vectors both implement the List interface, and both use (dynamically resizable) arrays for their internal data structure, much like using an ordinary array.
 * ArrayList is not synchronized. Vector is synchronized.
 * ArrayList increments 50% of the current array size if the number of elements exceeds ts capacity.
 * Vector increments 100% means doubles the array size if the total number of elements exceeds its capacity.
 * ArrayList is fast because it is non-synchronized.
 * Vector is slow because it is synchronized, i.e., in a multithreading environment, it holds the other threads in a runnable or non-runnable state until the current thread releases the lock of the object.
 * ArrayList uses the Iterator interface to traverse the elements.
 * A Vector can use the Iterator interface or Enumeration interface to traverse the elements.
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
    }
}
