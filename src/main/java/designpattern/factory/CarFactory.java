package designpattern.factory;

public class CarFactory {
    public Car getCar(String carBrand) {
        if(carBrand.equalsIgnoreCase("Bmw")){
            return new Bmw();
        }
        if(carBrand.equalsIgnoreCase("Citroen")){
            return new Citroen();
        }
        return null;
    }
}
