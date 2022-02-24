package java8.consumer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        //Exemple 1
        Consumer<String> consumer1 = (String s) -> System.out.println(s);
        consumer1.accept("Toto");

        //Exemple 2
        Consumer<Integer> consumer2 = (Integer i) -> System.out.println(i);
        consumer2.accept(10);

        //Exemple 3 : Création d'un Consumer de multiplication par 2
        Consumer<List<Integer>> multiplierPar2 = (integerList) -> {
                integerList.stream()
                        .map(x -> x*2)
                        .forEach(System.out::print);
        };
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        multiplierPar2.accept(integerList); //2 4 6 8 10

        //Exemple4 : Création d'un consumer qui retourne la longueur d'une chaine de carractère
        System.out.println();
        List<String> stringList = Arrays.asList("ABC","N","HO");
        Consumer<List<String>> longueurChaineDeCarractere = list -> {
            list.stream()
                    .map(x->x.length())
                    .forEach(System.out::print);
        };
        longueurChaineDeCarractere.accept(stringList); //3 1 2
    }
}