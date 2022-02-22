package algorithms.codingame;

import algorithms.codingame.model.Actor;
import algorithms.codingame.model.Cast;
import java.util.Arrays;
import java.util.List;

public class Codingame {

    public static void main(String[] args) {
        System.out.println("-------------------------------------------------- exists --------------------------------------------------");
        int[] ints = { -9, 14, 37, 102 };
        System.out.println(exists(ints, 102)); // true
        System.out.println(exists(ints, 36));  // false


        System.out.println("-------------------------------------------------- recopieElements --------------------------------------------------");
        List<String> elements = Arrays.asList("Tomate", "Oignon", "Cornichon", "Poivron");
        List<String> filtredElements = recopieElementsApresJava8(elements);
        System.out.println(filtredElements);


        System.out.println("-------------------------------------------------- isPalindromic --------------------------------------------------");
        String text = "acca";
        boolean palindromicOrNot = isPalindromic(text);
        System.out.println(palindromicOrNot);


        System.out.println("-------------------------------------------------- getActorsOlderThan --------------------------------------------------");
        List<Actor> cast = Actor.createcast();
        List<Actor> castOlderThan = Cast.getActorsOlderThan(cast, 30);
        Cast.printActors(castOlderThan);


        System.out.println("-------------------------------------------------- count --------------------------------------------------");
        System.out.println(count(4));
        System.out.println(count(10000));

    }

    /*-------------------------------------------------- exists --------------------------------------------------*/
    static boolean exists(int[] ints, int number){
        return Arrays.stream(ints)
                .anyMatch(x -> x == number);
    }


    /*-------------------------------------------------- recopieElementsApresJava8 --------------------------------------------------*/
    static List<String> recopieElementsApresJava8(List<String> elements){
        return elements.stream()
                .filter(element -> !element.contains("a"))
                .toList();
    }

    /*-------------------------------------------------- isPalindromic --------------------------------------------------*/
    static boolean isPalindromic(String text){
        int n = text.length();
        for (int i = 0; i < n/2; i++) {
            if(text.charAt(i) != text.charAt(n-i-1))
                return false;
        }
        return true;
    }

    /*-------------------------------------------------- count --------------------------------------------------*/
    static int count(int n) {
        return (n * (n - 1)) / 2;
    }

}
