package general.thread;

public class ThreadExample extends Thread {
    public static void main(String[] args) {
        ThreadExample monThread = new ThreadExample();
        monThread.start();
        System.out.println("Ici je suis en dehors du thread");
    }

    @Override
    public void run() {
        System.out.println("Ici je suis à l'intérieur du thread");
    }
}
