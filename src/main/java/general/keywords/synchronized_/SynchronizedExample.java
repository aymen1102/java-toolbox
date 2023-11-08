package general.keywords.synchronized_;

public class SynchronizedExample extends Thread {

    String threadName;

    SynchronizedExample(String threadName) {
        this.threadName = threadName;
    }

    public static void main(String[] args) {
        Thread thread1 = new SynchronizedExample("Thread 1 : ");
        Thread thread2 = new SynchronizedExample("Thread 2 : ");
        thread1.start();
        thread2.start();
    }

    public void run() {
        displayNumbers();
    }

    /**
     * C'est lorsqu'un thread est en train d'exécuter une méthode,
     * empêcher l'accès à cette méthode à tous les autres threads.
     */
    public synchronized void displayNumbers() {
        for (int i = 0; i < 100; i++) {
            System.out.println(threadName + i);
        }
    }
}
