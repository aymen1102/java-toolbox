package general.thread;

public class MultiThreadingExample extends Thread {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            MultiThreadingExample multiThreadingExample = new MultiThreadingExample();
            multiThreadingExample.start();
        }
    }

    @Override
    public void run() {
        System.out.println("Thread " + currentThread().getId() + " is running !");
    }
}
