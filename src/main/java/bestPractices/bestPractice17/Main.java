package bestPractices.bestPractice17;

public class Main {
    public static void main(String[] args) {
        CarDao carDao = new CarDao("Mercedes");
        CarService carService = new CarService(carDao);
        System.out.println(carService.getBrandNameUpperCase());
    }
}
