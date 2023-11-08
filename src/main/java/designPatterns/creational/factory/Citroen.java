package designPatterns.creational.factory;

public class Citroen implements Car {
    @Override
    public void run() {
        System.out.println("The Citroen is running...");
    }

    @Override
    public void stop() {
        System.out.println("The Citroen is stopping...");
    }
}
