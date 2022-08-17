package general.thread;

public class ThreadSleepExample {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 5; i++) {
            Thread.sleep(500);
            System.out.println(i);
        }
    }
}
