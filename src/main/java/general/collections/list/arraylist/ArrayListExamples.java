package general.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        products.add("Computer");
        products.add("Mouse");
        products.add("Keyboard");
        products.add("Screen");

        System.out.println("ArrayList: " + products); // [Computer, Mouse, Keyboard, Screen]

        String product1 = products.get(1);
        System.out.println("Element at index 1: " + product1); // Mouse

        products.set(1, "Printer");
        System.out.println("ArrayList: " + products); // [Computer, Printer, Keyboard, Screen]

        products.remove(3);
        System.out.println("ArrayList: " + products); // [Computer, Printer, Keyboard]

        int size = products.size();
        System.out.println("Size : " + size); // 3

        products.sort(Comparator.naturalOrder());
        System.out.println("ArrayList: " + products); // [Computer, Keyboard, Printer]

        boolean containsComputer = products.contains("Computer");
        System.out.println(containsComputer); //true

        boolean empty = products.isEmpty();
        System.out.println(empty); // false

        int indexOfComputer = products.indexOf("Computer");
        System.out.println(indexOfComputer); // 0

        Iterator<String> iterator = products.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());  // Computer Keyboard Printer
        }
    }
}
