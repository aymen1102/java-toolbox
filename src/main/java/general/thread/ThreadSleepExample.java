package general.thread;

public class ThreadSleepExample {

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(500);
                System.out.println(i);
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
