package java8.stream;

import java.util.stream.IntStream;
import java.util.*;
import java.util.stream.Stream;

public class StreamJava {

    public static void main(String[] args) {
/*<------------------------------------------------------------------------------------------------------->*/
        //Integer Stream
        IntStream
                .range(1,10)
                .forEach(System.out::print);  //123456789
        System.out.println();
/*<------------------------------------------------------------------------------------------------------->*/
        IntStream
                .range(1,10)
                .skip(5)
                .forEach(x -> System.out.print(x));  //6789
        System.out.println();
/*<------------------------------------------------------------------------------------------------------->*/
        System.out.println(
                IntStream
                        .range(1,5)
                        .sum()
        ); //10
/*<------------------------------------------------------------------------------------------------------->*/
        Stream.of("Ava","Aneri","Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println); //Alberto
// /*<------------------------------------------------------------------------------------------------------->*/
        String[] names = {"Sa","Al","Ankit","Soolking"};
        Arrays.stream(names)
                .filter(x->x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);
    }

}