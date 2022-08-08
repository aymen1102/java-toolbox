package general.collections.queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeExample {
    public static void main(String[] args) {
        // Initializing an deque
        Deque<String> dq0
                = new ArrayDeque<String>();
        // add() method to insert
        dq0.add("For");
        dq0.addFirst("Geeks");
        dq0.addLast("Geeks");
        System.out.println(dq0);




        Deque<String> dq1 = new ArrayDeque<String>();
        // add() method to insert
        dq1.add("For");
        dq1.addFirst("Geeks");
        dq1.addLast("Geeks");
        System.out.println(dq1);
        System.out.println(dq1.pop());
        System.out.println(dq1.poll());
        System.out.println(dq1.pollFirst());
        System.out.println(dq1.pollLast());



        // Initializing an deque
        Deque<String> dq2
                = new ArrayDeque<String>();
        // add() method to insert
        dq2.add("For");
        dq2.addFirst("Geeks");
        dq2.addLast("Geeks");
        dq2.add("is so good");
        for (Iterator itr = dq2.iterator();
             itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        for (Iterator itr = dq2.descendingIterator();
             itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }
    }
}
