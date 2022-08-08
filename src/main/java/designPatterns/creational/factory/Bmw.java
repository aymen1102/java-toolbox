package designPatterns.creational.factory;

public class Bmw implements Car{


    @Override
    public void run() {
        System.out.println("The Bmw is running...");
    }

    @Override
    public void stop() {
        System.out.println("The Bmw is stopping...");
    }
}
