package general.collections.queue.priorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * PriorityQueue in Java is a data structure that implements the Queue interface and provides a queue-based framework
 * that orders its elements according to their natural ordering or by a Comparator provided at queue construction time.
 * The most important aspect of a PriorityQueue is that it does not follow the FIFO (first-in-first-out) principle like a regular queue;
 * instead, it orders elements based on priority, which means that when you retrieve an element from the queue,
 * you always get the element with the highest priority as defined by the ordering, and not necessarily the element that was first inserted.
 * This is achieved with the help of a heap data structure, usually a binary heap, leading to O(log(n)) time complexity for insertions and deletions.
 * A PriorityQueue does not permit null elements and is not thread-safe; concurrent modifications without proper synchronization will result in data corruption.
 */
public class PriorityQueueExample {
    public static void main(String args[])
    {
        // Creating a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding items to the PriorityQueue; they are automatically ordered by natural ordering (min-heap by default)
        priorityQueue.add(25);
        priorityQueue.add(12);
        priorityQueue.add(9);
        priorityQueue.add(30);
        priorityQueue.add(1);

        // Displaying the PriorityQueue elements
        System.out.println("PriorityQueue contents: " + priorityQueue);

        // Polling elements from the PriorityQueue
        while (!priorityQueue.isEmpty()) {
            // This will remove the element with the highest priority (lowest number in this case)
            System.out.println("Polling from PriorityQueue: " + priorityQueue.poll());
        }
    }
}
