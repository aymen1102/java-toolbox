package general.keywords.synchronized_;

/**
 * The synchronized keyword in Java is used to ensure that a method or block is accessible by only one thread at a time.
 * It is fundamental for thread synchronization, which is crucial when dealing with shared resources to prevent thread interference and consistency errors.
 * When a method is synchronized, the thread holds the method's object's lock or the class's lock for static methods, until the method completes.
 * If another thread attempts to invoke a synchronized method on the same object, it will block until the lock is released.
 * <p>
 * The output will be a series of print statements from both threads, showing the incrementing count.
 * The exact order of the output may vary between executions, but the count will be incremented a total of 10 times
 * (5 times by each thread)
 */
public class SynchronizedExample {
    public static void main(String[] args) {
        Counter counter = new Counter(); // Shared object
        // Creating two threads that share the same Counter object
        CounterThread thread1 = new CounterThread(counter);
        CounterThread thread2 = new CounterThread(counter);
        thread1.start();
        thread2.start();
    }
}

class Counter {
    private int count = 0;

    // Synchronized method to increment count
    public synchronized void increment() {
        count++;
    }

    // Synchronized method to get the current count value
    public synchronized int getCount() {
        return count;
    }
}

class CounterThread extends Thread {
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
            System.out.println(Thread.currentThread().getName() + " incremented count to " + counter.getCount());
        }
    }
}