package general.keywords.synchronized_;

public class SynchronizedExample extends Thread{


    public void run(){
        displayNumbers();
    }

    /** C'est lorsqu'un thread est en train d'exécuter une méthode,
     * empêcher l'accès à cette méthode à tous les autres threads.*/
    public synchronized void displayNumbers(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new SynchronizedExample();
        Thread thread2 = new SynchronizedExample();
        thread1.start();
        thread2.start();
    }
}
