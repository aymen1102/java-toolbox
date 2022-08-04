package java11.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional car = Optional.of("Mercedes");
        car.ifPresent(x -> System.out.println(x)); //Mercedes
        System.out.println(car.isEmpty());  //false
        System.out.println(car.isPresent()); //true
        car = car.empty();
        System.out.println(car.isEmpty());      //true
        System.out.println(car.isPresent());    //false
    }
}
