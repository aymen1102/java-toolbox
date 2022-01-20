package java11.predicateNot;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNot {

    public static void main(String[] args) {
        List<Integer> nombres = List.of(2,5,6,9,1);
        Predicate<Integer> nombrePairesPredicate = nombre -> nombre%2 == 0;

        nombres.stream().filter(nombrePairesPredicate).forEach(System.out::println); // 2 6
        nombres.stream().filter(nombrePairesPredicate.negate()).forEach(System.out::println); // 5 9 1

        nombres.stream().filter(PredicateNot::isPaire).forEach(System.out::println); // 2 6
        nombres.stream().filter(Predicate.not(PredicateNot::isPaire)).forEach(System.out::println); // 5 9 1

    }

    public static boolean isPaire(Integer nombre){
        return nombre % 2 == 0;
    }
}
