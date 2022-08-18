package java10.typeInference;

import java.util.Arrays;
import java.util.List;

public class TypeInferanceExample {
    public static void main(String[] args) {
        var numbers = Arrays.asList("One", "Two", "Three", "Four", "Five");
        System.out.println(numbers);

        List<String> cars = List.of("Mercedes","BMW","Renault");
        List<String> countries = List.of("Allemagne","France");

        List<List<String>> carsCountries = List.of(cars,countries);
        System.out.println(carsCountries); //[[Mercedes, BMW, Renault], [Allemagne, France]]

        var carsCountriesVar = List.of(cars,countries);
        System.out.println(carsCountriesVar); //[[Mercedes, BMW, Renault], [Allemagne, France]]
    }
}
