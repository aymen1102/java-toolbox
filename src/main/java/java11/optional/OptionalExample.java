package java11.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        System.out.println("*** isPresent/isEmpty ***");
        Optional<String> optional1 = Optional.of("Mercedes");
        optional1.ifPresent(System.out::println); //Mercedes
        System.out.println(optional1.isEmpty());  //false
        System.out.println(optional1.isPresent()); //true

        optional1 = Optional.empty();
        System.out.println(optional1.isEmpty());      //true
        System.out.println(optional1.isPresent());    //false


        System.out.println("*** orElseThrow ***");
        Optional<String> optional2 = Optional.ofNullable("Hello, world!");
        String value = optional2.orElseThrow(() -> new NoSuchElementException("Value is absent"));
        System.out.println(value);

        Optional<String> emptyOptional = Optional.empty();
        String emptyValue = emptyOptional.orElseThrow(() -> new NoSuchElementException("Value is absent"));
        System.out.println(emptyValue);
    }
}
