package java10.typeInference;

import java.util.Arrays;
import java.util.List;

public class TypeInferanceExamples {

    public static void main(String[] args) {
        var numbers = Arrays.asList("One", "Two", "Three", "Four", "Five");
        System.out.println(numbers);


        List<String> cars = List.of("Mercedes","BMW","Renault");
        List<String> countries = List.of("Allemagne","France");

        List<List<String>> CarsCountries = List.of(cars,countries);
        System.out.println(CarsCountries); //[[Mercedes, BMW, Renault], [Allemagne, France]]

        var CarsCountriesVar = List.of(cars,countries);
        System.out.println(CarsCountriesVar); //[[Mercedes, BMW, Renault], [Allemagne, France]]
    }
}
