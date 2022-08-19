package general.collections.list.linkedlist;

import java.util.Comparator;
import java.util.LinkedList;

/**
 * Both ArrayList and LinkedList are implementation of List interface in Java.
 * Both classes are non-synchronized.
 * But there are certain differences as well.
 * In LinkedList, insertion, addition, and removal operations are faster as compared
 * to the ArrayLists because there is no need to resize the LinkedList.
 * LinkedList is based on doubly LinkedList implementation on the other hand the
 * ArrayLists are based on the dynamically resizable arrays.
 * LinkedList consumes more memory than ArrayList.
 * ArrayList provides random access to any item while LinkedList provides sequential access to the items.
 * In ArrayList, the manipulation process is a bit slow as compared to LinkedList because in ArrayList
 * when an item is removed, numerous changes (shifting of items) take place.
 */
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> products = new LinkedList<>();
        products.add("Computer");
        products.add("Mouse");
        products.add("Keyboard");
        products.add("Screen");

        System.out.println("ArrayList: " +products); // [Computer, Mouse, Keyboard, Screen]

        String product1 = products.get(1);
        System.out.println("Element at index 1: " + product1); // Mouse

        products.set(1,"Printer");
        System.out.println("LinkedList: " +products); // [Computer, Printer, Keyboard, Screen]

        products.remove(3);
        System.out.println("LinkedList: " +products); // [Computer, Printer, Keyboard]

        int size = products.size();
        System.out.println("Size : "+size); // 3

        products.sort(Comparator.naturalOrder());
        System.out.println("LinkedList: " +products); // [Computer, Keyboard, Printer]

        boolean containsComputer = products.contains("Computer");
        System.out.println(containsComputer); //true

        boolean empty = products.isEmpty();
        System.out.println(empty); // false

        int indexOfComputer = products.indexOf("Computer");
        System.out.println(indexOfComputer); // 0
    }
}
