package general.thread;

public class ThreadSleepExample extends Thread {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            sleep(500);
            System.out.println(i);
        }
    }
}
