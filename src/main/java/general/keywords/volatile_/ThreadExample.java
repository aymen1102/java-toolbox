package general.keywords.volatile_;

public class
ThreadExample extends Thread{
    private VolatileExample volatileExample;

    public ThreadExample(VolatileExample volatileExample) {
        this.volatileExample = volatileExample;
    }

    @Override
    public void run() {
        int oldValue = volatileExample.getCounter();
        System.out.println("Thread : "+Thread.currentThread().getId()+", Old value : "+oldValue);
        volatileExample.increaseCounter();
        int newValue = volatileExample.getCounter();
        System.out.println("Thread : "+Thread.currentThread().getId()+
                        ", Old value : "+newValue);
    }
}
