package general.thread;

public class ThreadExample extends Thread {
    public static void main(String[] args) {
        ThreadExample monThread = new ThreadExample();
        monThread.start();
        System.out.println("Here, i'm outside the thread");
    }

    @Override
    public void run() {
        try {
            sleep(4000);
            System.out.println("Here, i'm inside the thread");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
