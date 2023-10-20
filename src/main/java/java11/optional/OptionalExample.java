package java11.optional;

import java.util.Optional;
import java.util.NoSuchElementException;

public class OptionalExample {
    public static void main(String[] args) {
        System.out.println("*** isPresent/isEmpty ***");
        Optional<String> car = Optional.of("Mercedes");
        car.ifPresent(System.out::println); //Mercedes
        System.out.println(car.isEmpty());  //false
        System.out.println(car.isPresent()); //true

        car = Optional.empty();
        System.out.println(car.isEmpty());      //true
        System.out.println(car.isPresent());    //false


        System.out.println("*** orElseThrow ***");
        Optional<String> optional = Optional.ofNullable("Hello, world!");
        String value = optional.orElseThrow(() -> new NoSuchElementException("Value is absent"));
        System.out.println(value);

        Optional<String> emptyOptional = Optional.empty();
        String emptyValue = emptyOptional.orElseThrow(() -> new NoSuchElementException("Value is absent"));
        System.out.println(emptyValue);
    }
}
