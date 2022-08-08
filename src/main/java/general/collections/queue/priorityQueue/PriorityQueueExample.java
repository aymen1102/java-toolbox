package general.collections.queue.priorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String args[])
    {
        Queue<String> pq0 = new PriorityQueue<>();
        pq0.add("Geeks");
        pq0.add("For");
        pq0.add("Geeks");
        System.out.println(pq0);


        Queue<String> pq1 = new PriorityQueue<>();
        pq1.add("Geeks");
        pq1.add("For");
        pq1.add("Geeks");
        Iterator iterator = pq1.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }


        // Creating empty priority queue
        Queue<Integer> pq2
                = new PriorityQueue<Integer>();
        // Adding items to the pQueue
        // using add()
        pq2.add(10);
        pq2.add(20);
        pq2.add(15);
        // Printing the top element of
        // the PriorityQueue
        System.out.println(pq2.peek());
        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pq2.poll());
        // Printing the top element again
        System.out.println(pq2.peek());
    }
}
