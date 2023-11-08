package general.collections.queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Deque in Java is a double-ended queue interface that extends the Queue interface.
 * The key feature of a Deque is that it supports insertion, removal, and retrieval of elements
 * from both the front and the rear ends, making it a highly flexible data structure that can be used
 * both as a queue (FIFO) and a stack (LIFO). Implementations of the Deque interface,
 * such as ArrayDeque and LinkedList, provide a robust set of methods like
 * addFirst(), addLast(), pollFirst(), and pollLast(), which allow for versatile manipulation of elements.
 * Deque is not synchronized, meaning that concurrent modifications from multiple threads
 * without external synchronization are not thread-safe.
 * It is particularly useful when you need a resizable array or when frequent insertions and deletions are required at both ends.
 */
public class DequeExample {
    public static void main(String[] args) {
        // Creating a Deque and adding elements to it
        Deque<String> deque = new ArrayDeque<>();

        // Add elements at the tail
        deque.addLast("Element 1 (Tail)"); // addLast is equivalent to offerLast
        deque.offer("Element 2 (Tail)");

        // Add elements at the head
        deque.addFirst("Element 3 (Head)"); // addFirst is equivalent to offerFirst
        deque.offerFirst("Element 4 (Head)");

        System.out.println("Initial Deque: " + deque);

        // Removing elements from the Deque
        System.out.println("Removed element at tail: " + deque.removeLast());
        System.out.println("Removed element at head: " + deque.removeFirst());

        System.out.println("Deque after removals: " + deque);

        // Peek at the head without removing
        System.out.println("Peek first: " + deque.peekFirst());

        // Peek at the tail without removing
        System.out.println("Peek last: " + deque.peekLast());
    }
}
