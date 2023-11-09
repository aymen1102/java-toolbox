package general.keywords.volatile_;

/**
 * The volatile keyword in Java is used to indicate that a variable's value will be modified by different threads.
 * Declaring a volatile variable ensures that its value is read from and written to main memory,
 * thus guaranteeing visibility of changes to different threads.
 */
public class VolatileExample {
    private volatile int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        VolatileExample volatileExample = new VolatileExample();
        ThreadExample[] threads = new ThreadExample[2];
        for (int i = 0; i < 2; i++) {
            threads[i] = new ThreadExample(volatileExample);
            threads[i].start();
            threads[i].join();
        }
    }

    public int getCounter() {
        return counter;
    }

    public void increaseCounter() {
        counter++;
    }
}
