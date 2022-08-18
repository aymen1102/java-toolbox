package designPatterns.creational.factory;

public class Demo {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car bmw = carFactory.getCar("Bmw");
        bmw.run();
        bmw.stop();

        Car citroen = carFactory.getCar("Citroen");
        citroen.run();
        citroen.stop();
    }
}
