package general.keywords.volatile_;

public class Main {
    private static final int threadsNumber = 2;

    public static void main(String[] args) throws InterruptedException {
        VolatileExample volatileExample = new VolatileExample();
        ThreadExample[] threads = new ThreadExample[threadsNumber];
        for (int i = 0; i < threadsNumber; i++) {
            threads[i] = new ThreadExample(volatileExample);
            threads[i].start();
            threads[i].join();
        }
    }
}
