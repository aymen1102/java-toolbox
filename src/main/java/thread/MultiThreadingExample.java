package thread;

public class MultiThreadingExample extends Thread{
    public void run(){
        try {
            System.out.println("Thread "+ currentThread().getId()+" is running !");
        } catch (Exception exception){
            System.out.println(exception);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            MultiThreadingExample multiThreadingExample = new MultiThreadingExample();
            multiThreadingExample.start();
        }
    }
}
