package java8.stream;

import java8.stream.model.Product;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.*;
import java.util.stream.Stream;

public class StreamExamples {

    public static void main(String[] args) {
        System.out.println("-------------------------------------------------- Stream 1 --------------------------------------------------");
        IntStream.range(1, 4)
                .forEach(System.out::println);  //1 2 3 4


        System.out.println("-------------------------------------------------- Stream 2 --------------------------------------------------");
        IntStream.range(1, 10)
                .skip(5)
                .forEach(System.out::println);  //6 7 8 9


        System.out.println("-------------------------------------------------- Stream 3 --------------------------------------------------");
        System.out.println(
                IntStream.range(1, 5)
                        .sum()
        ); //10


        System.out.println("-------------------------------------------------- Stream 4 --------------------------------------------------");
        IntStream.range(1, 4)
                .mapToObj(x -> "a" + x)
                .forEach(System.out::println); //a1 a2 a3


        System.out.println("-------------------------------------------------- Stream 5 --------------------------------------------------");
        int[] intTable = {1, 2, 3};
        Arrays.stream(intTable)
                .map(x -> 2 * x + 1)
                .average()
                .ifPresent(System.out::println);  //5.0


        System.out.println("-------------------------------------------------- Stream 6 --------------------------------------------------");
        String[] names = {"Soolking", "Al", "Ankit", "Sa"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println); //Sa Soolking


        System.out.println("-------------------------------------------------- Stream 7 --------------------------------------------------");
        List<String> list7 = Arrays.asList("a1", "a2", "a3", "a4");
        list7.stream()
                .findFirst()
                .ifPresent(System.out::println); //a1


        System.out.println("-------------------------------------------------- Stream 8 --------------------------------------------------");
        Stream.iterate(1, x -> x + 1)
                .filter(x -> x % 5 == 0)
                .limit(4)
                .forEach(System.out::println); //5 10 15 20


        System.out.println("-------------------------------------------------- Stream 9 --------------------------------------------------");
        boolean b2 = Stream.of("d2", "a2", "b1", "l3", "c4")
                .map(x -> {
                    System.out.println("map:" + x);
                    return x.toUpperCase();
                })
                .anyMatch(x -> {
                    System.out.println("anyMatch:" + x);
                    return x.startsWith("A");
                });   //   map:d2 anyMatch:D2 map:a2 anyMatch:A2
        System.out.println(b2);  // true


        System.out.println("-------------------------------------------------- Stream 10 --------------------------------------------------");
        Stream.of("a1", "a2", "a3", "a4")
                .findFirst()
                .ifPresent(System.out::println); //a1


        System.out.println("-------------------------------------------------- Stream 11 --------------------------------------------------");
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println); //Alberto


        System.out.println("-------------------------------------------------- Stream 12 --------------------------------------------------");
        Stream.of("a1", "a2", "a3")
                .map(x -> x.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println); //3


        System.out.println("-------------------------------------------------- Stream 13 --------------------------------------------------");
        Stream.of(1.0, 2.0, 3.0)
                .mapToInt(Double::intValue)
                .mapToObj(x -> "a" + x)
                .forEach(System.out::println); //a1a2a3


        System.out.println("-------------------------------------------------- Stream 14 --------------------------------------------------");
        Stream.of("a1", "a4", "b2").filter(x -> {
            System.out.println("filter:" + x);
            return true;
        }).forEach(x -> System.out.println("foreach:" + x));
                                                               /* filter:a1
                                                                foreach:a1
                                                                filter:a4
                                                                foreach:a4
                                                                filter:b2
                                                                foreach:b2*/

        System.out.println("-------------------------------------------------- Stream 15 --------------------------------------------------");
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Computer", 1200));
        productList.add(new Product(2, "Smartphone", 400));
        productList.add(new Product(3, "ATV", 800));
        productList.stream()
                .filter(product -> product.price == 400)
                .forEach(product -> System.out.println(product.name)); // Smartphone


        System.out.println("-------------------------------------------------- Stream 16 --------------------------------------------------");
        List<Product> productListSorted = productList.stream()
                .sorted(Comparator.comparing(Product::getName))
                .toList();
        System.out.println(productListSorted);
                                                /*[ Product [id=3, name=ATV, price=800.0],
                                                Product [id=1, name=Computer, price=1200.0],
                                                Product [id=2, name=Smartphone, price=400.0]]*/


        System.out.println("-------------------------------------------------- Stream 17 --------------------------------------------------");
        List<Float> integerList = productList.stream()
                .filter(x -> x.price > 600)
                .map(x -> x.price)
                .toList();
        System.out.println(integerList);   //[1200.0, 800.0]


        System.out.println("-------------------------------------------------- Stream 18 --------------------------------------------------");
        float somme = productList.stream()
                .map(Product::getPrice)
                .reduce(0.0f, Float::sum);
        System.out.println(somme); //2400.0


        System.out.println("-------------------------------------------------- Stream 19 --------------------------------------------------");
        double somme0 = productList.stream()
                .mapToDouble(Product::getPrice).
                sum();
        System.out.println(somme0); //2400.0


        System.out.println("-------------------------------------------------- Stream 20 --------------------------------------------------");
        productList.stream()
                .map(Product::getPrice)
                .mapToInt(Float::intValue)
                .max()
                .ifPresent(System.out::println); //1200


        System.out.println("-------------------------------------------------- Stream 21 --------------------------------------------------");
        Set<Float> floatSet = productList.stream()
                .map(Product::getPrice)
                .filter(price -> price < 900)
                .collect(Collectors.toSet());
        System.out.println(floatSet);   // [400.0, 800.0]


        System.out.println("-------------------------------------------------- Stream 22 --------------------------------------------------");
        List<String> stringList = Arrays.asList("a1", "a2", "c1", "c4");
        stringList.stream()
                .filter(x -> x.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println); //C1 C4


        System.out.println("-------------------------------------------------- Stream 23 --------------------------------------------------");
        Stream.iterate(100, n -> n + 2)
                .limit(5)
                .forEach(System.out::println); // 100 102 104 106 108


        System.out.println("-------------------------------------------------- Stream 24 --------------------------------------------------");
        long count = Stream.of("mohan", "john", "vaibhav", "amit")
                .map(String::toUpperCase)
                .peek(System.out::println) //MOHAN JOHN VAIBHAV AMIT
                .filter(x -> x.startsWith("J"))
                .count();
        System.out.println("Count of names start with J : " + count); //1


        System.out.println("-------------------------------------------------- Stream 25 --------------------------------------------------");
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
        List<List<Integer>> listofLists = Arrays.asList(list1, list2);
        System.out.println("Avant : " + listofLists);
        List<Integer> listOfAllIntegers = listofLists.stream()
                .flatMap(Collection::stream)
                .toList();
        System.out.println("Après : " + listOfAllIntegers); //Après : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


        System.out.println("-------------------------------------------------- Stream 26 --------------------------------------------------");
        List<Integer> ages = Arrays.asList(17, 23, 10);
        Integer total = ages.stream()
                .reduce(0, Integer::sum);
        System.out.println(total); //50


        System.out.println("-------------------------------------------------- Stream 27 --------------------------------------------------");
        List<String> letters = Arrays.asList("a", "b", "c", "d");
        String lettersReduced = letters.stream()
                .reduce("letters reduced : ", (char1, char2) -> char1 + char2);
        System.out.println(lettersReduced); //letters reduced : abcd


        System.out.println("-------------------------------------------------- Stream 28 --------------------------------------------------");
        List<Integer> numbers = Arrays.asList(5, 10, 15);
        boolean b = numbers.stream()
                .allMatch(x -> x % 5 == 0);
        System.out.println(b); //true


        System.out.println("-------------------------------------------------- Stream 29 --------------------------------------------------");
        boolean b1 = productList.stream()
                .anyMatch(x -> x.getPrice() < 300);
        System.out.println(b1); //false


        System.out.println("-------------------------------------------------- Stream 30 --------------------------------------------------");
        productList.stream()
                .min(Comparator.comparing(Product::getPrice))
                .ifPresent(System.out::println); // Product [id=2, name=Smartphone, price=400.0]


        System.out.println("-------------------------------------------------- Stream 31 --------------------------------------------------");
        productList.stream()
                .max(Comparator.comparing(Product::getPrice))
                .ifPresent(System.out::println); // Product [id=1, name=Computer, price=1200.0]

        System.out.println("-------------------------------------------------- Stream 32 --------------------------------------------------");
        Stream
                .generate(new Random()::nextInt)
                .limit(3)
                .forEach(System.out::println);
                                                    //973443298
                                                    //364407531
                                                    //683047583

        System.out.println("-------------------------------------------------- Stream 33 --------------------------------------------------");
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> troisPremierNombrePairAuCarre =
                nombres.stream()
                        .filter(n -> {
                            System.out.println("filter " + n);
                            return n % 2 == 0;
                        })
                        .map(n -> {
                            System.out.println("map " + n);
                            return n * n;
                        })
                        .limit(3)
                        .toList();
        System.out.println(troisPremierNombrePairAuCarre); // [4, 16, 36]


        System.out.println("-------------------------------------------------- Stream 34 --------------------------------------------------");
        List<String> list = Arrays.asList("A","B","C","D","A","B","C");
        List<String> distinctElements = list.stream()
                .distinct()
                .toList();
        System.out.println(distinctElements); // [A, B, C, D]

    }
}
