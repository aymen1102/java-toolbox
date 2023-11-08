package general.dependencyInjection.annotation;

import org.springframework.stereotype.Component;

@Component
public class Main {
    private static CarService carService;

    public static void main(String[] args) {
        CarService carService = new CarService();
        System.out.println(carService.getBrandNameUpperCase());
    }
}
