package java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExamples {
    public static void main(String[] args) {
        //Exemple 1
        Consumer<String> consumer =
                (String s) -> System.out.println(s);
        consumer.accept("Toto"); // Toto

        //Exemple 2
        Function<String,Integer> function = (String name) -> {
            return  name.length();
        };
        Integer nameLength = function.apply("Gregoire");
        System.out.println(nameLength);   // 8

        //Exemple 3
        Predicate<String> predicate = value3 -> value3.startsWith("S");
        List<String> stringList = Arrays.asList("Alice","Salim","Salma");
        stringList.stream()
                .filter(predicate)
                .forEach(System.out::println); // Salim Salma

        //Exemple 4
        Supplier supplier = () -> "Ceci est un fournisseur";
        System.out.println(supplier.get());  //Ceci est un fournisseur
    }
}
