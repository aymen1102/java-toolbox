package java11.typeInference;

import java.util.Arrays;
import java.util.List;

public class TypeInferenceExample {
    public static void main(String[] args) {
        var numbers = Arrays.asList("One", "Two", "Three", "Four", "Five");
        System.out.println(numbers);

        List<String> cars = List.of("Mercedes", "BMW", "Renault");
        List<String> countries = List.of("Germany", "France");

        List<List<String>> carsCountries = List.of(cars, countries);
        System.out.println(carsCountries); //[[Mercedes, BMW, Renault], [Germany, France]]

        var carsCountriesVar = List.of(cars, countries);   // Type inference with var keyword
        System.out.println(carsCountriesVar); //[[Mercedes, BMW, Renault], [Germany, France]]
    }
}
