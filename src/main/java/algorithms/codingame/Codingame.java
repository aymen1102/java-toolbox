package algorithms.codingame;

import algorithms.codingame.model.Actor;
import algorithms.codingame.model.Cast;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Codingame {

    public static void main(String[] args) {
        System.out.println("-------------------------------------------------- exists --------------------------------------------------");
        int[] ints = {-9, 14, 37, 102};
        System.out.println(exists(ints, 102)); // true
        System.out.println(exists(ints, 36));  // false


        System.out.println("-------------------------------------------------- recopieElements --------------------------------------------------");
        List<String> elements = Arrays.asList("Tomate", "Oignon", "Cornichon", "Poivron");
        List<String> filteredElements = recopieElementsApresJava8(elements);
        System.out.println(filteredElements); //[Oignon, Cornichon, Poivron]


        System.out.println("-------------------------------------------------- isPalindromic --------------------------------------------------");
        String text = "acca";
        boolean palindromicOrNot = isPalindromic(text);
        System.out.println(palindromicOrNot); // true


        System.out.println("-------------------------------------------------- getActorsOlderThan --------------------------------------------------");
        List<Actor> cast = Actor.createcast();
        List<Actor> castOlderThan = Cast.getActorsOlderThan(cast, 30);
        Cast.printActors(castOlderThan);  //Fred, 41     Omar, 31


        System.out.println("-------------------------------------------------- count --------------------------------------------------");
        System.out.println(count(4)); // 6
        System.out.println(count(10000)); // 49995000


        System.out.println("-------------------------------------------------- findLargest --------------------------------------------------");
        int[] numbers = {1, -28, 88, 200, 7};
        int resut = findLargest(numbers);
        System.out.println(resut);  // 200


        System.out.println("-------------------------------------------------- concat --------------------------------------------------");
        String[] concat = {"f", "o", "o", "bar"};
        System.out.println(concat(concat)); //foobar


        System.out.println("-------------------------------------------------- sumRange --------------------------------------------------");
        int[] intsSumRange = {1, 20, 3, 10, -2, 100};
        int result = sumRange(intsSumRange);
        System.out.println("result:" + result); //130


        System.out.println("-------------------------------------------------- calc --------------------------------------------------");
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 3};
        System.out.println(calc(array, 0, 1)); //1
        System.out.println(calc(array, 0, 5)); //15
        System.out.println(calc(array, 0, 0)); //0


        System.out.println("-------------------------------------------------- closestToZero --------------------------------------------------");
        int[] numbers0 = {-9, 8, 2, -5, -1};
        int resut0 = closestToZero(numbers0);
        System.out.println(resut0); // -1


        System.out.println("-------------------------------------------------- a --------------------------------------------------");
        System.out.println(a(1, 5)); // true
        System.out.println(a(2, 3)); // false
        System.out.println(a(-3, 4)); // true


        System.out.println("-------------------------------------------------- isFoo --------------------------------------------------");
        System.out.println(isFoo("foo")); // true
        System.out.println(isFoo("toto")); // false


        System.out.println("-------------------------------------------------- isPrime --------------------------------------------------");
        System.out.println(isPrime(1)); // false
        System.out.println(isPrime(5)); // true
        System.out.println(isPrime(15)); // false
        System.out.println(isPrime(32)); // false
        System.out.println(isPrime(67)); // true

        System.out.println("-------------------------------------------------- isTwin --------------------------------------------------");
        System.out.println(isTwin("Hello", "world")); // false
        System.out.println(isTwin("acb", "bca")); // true
        System.out.println(isTwin("Lookout", "Outlook")); // true


        System.out.println("-------------------------------------------------- reshape --------------------------------------------------");
        System.out.println(reshape(3, "abc de fghijb"));  // abc\ndef\nghi\njb
        System.out.println(reshape(6, "1 23 456 7"));  // 123456\n7


        System.out.println("-------------------------------------------------- check --------------------------------------------------");
        System.out.println(check("[()]"));   // true
        System.out.println(check("(()[])")); // true
        System.out.println(check("(()[]]")); // false
        System.out.println(check("()[]"));   // true
        System.out.println(check("()]"));   // false
        System.out.println(check("([)]"));   // false
        System.out.println(check("(()[]())"));   // true
        System.out.println(check("()[()]"));   // true
        System.out.println(check("(]"));   // false

    }


    /*-------------------------------------------------- exists --------------------------------------------------*/
    static boolean exists(int[] ints, int number) {
        return Arrays.stream(ints)
                .anyMatch(x -> x == number);
    }


    /*-------------------------------------------------- recopieElementsApresJava8 --------------------------------------------------*/
    static List<String> recopieElementsApresJava8(List<String> elements) {
        return elements.stream()
                .filter(element -> !element.contains("a"))
                .toList();
    }


    /*-------------------------------------------------- isPalindromic --------------------------------------------------*/
    static boolean isPalindromic(String text) {
        int n = text.length();
        for (int i = 0; i < n / 2; i++) {
            if (text.charAt(i) != text.charAt(n - i - 1))
                return false;
        }
        return true;
    }


    /*-------------------------------------------------- count --------------------------------------------------*/
    static int count(int n) {
        return (n * (n - 1)) / 2;
    }


    /*-------------------------------------------------- findLargest --------------------------------------------------*/
    static int findLargest(int[] numbers) {
        return Arrays.stream(numbers).max().getAsInt();
    }


    /*-------------------------------------------------- concat --------------------------------------------------*/
    static String concat(String[] concat) {
        return Arrays.stream(concat)
                .reduce("", (mot1, mot2) -> mot1 + mot2);
    }


    /*-------------------------------------------------- sumRange --------------------------------------------------*/
    static int sumRange(int[] ints) {
        return Arrays.stream(ints)
                .filter(x -> x >= 10 && x <= 100)
                .sum();
    }


    /*-------------------------------------------------- calc --------------------------------------------------*/
    public static int  calc(int[] array, int n1, int n2) {
        int sum = 0;
        for (int i = n1; i <= n2; i++) {
            sum = sum + array[i];
        }
        return sum;
    }


    /*-------------------------------------------------- closestToZero --------------------------------------------------*/
    static int closestToZero(int[] numbers) {
        if (numbers.length == 0)
            return 0;
        int closest = numbers[0];
        for (int number : numbers) {
            int abs = Math.abs(number);
            int absClosest = Math.abs(closest);
            if (abs < absClosest)
                closest = number;
            else if (abs == absClosest && closest < 0)
                closest = number;
        }
        return closest;
    }


    /*-------------------------------------------------- a --------------------------------------------------*/
    static boolean a(int i, int j) {
        return i == 1 || j == 1 || i + j == 1;
    }


    /*-------------------------------------------------- isFoo --------------------------------------------------*/
    static boolean isFoo(String param) {
        return "foo".equals(param);
    }


    /*-------------------------------------------------- isPrime --------------------------------------------------*/
    static boolean isPrime(int n) {
        boolean isPrime = true;
        if (n < 0 || n == 1)
            isPrime = false;
        else if (n != 0)
            for (int i = 2; i <= n / 2; i++) {
                if (n != i && n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        return isPrime;
    }


    /*-------------------------------------------------- isTwin --------------------------------------------------*/
    static boolean isTwin(String word1, String word2) {
        char[] chars1 = word1.toLowerCase().toCharArray();
        char[] chars2 = word2.toLowerCase().toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }


    /*-------------------------------------------------- reshape --------------------------------------------------*/
    static String reshape(int n, String text) {
        String textWithoutSpaces = text.replace(" ","");
        String result = "";
        for (int i = 0; i < textWithoutSpaces.length(); i++) {
            if(i % n == 0 && i !=0)
                result=result+"\n"+textWithoutSpaces.charAt(i);
            else
                result=result+textWithoutSpaces.charAt(i);
        }
        return result;
    }


    /*-------------------------------------------------- check --------------------------------------------------*/
    static boolean check(String str) {
        Stack<Character> stack = new Stack();
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c == '(')
                stack.push(c);
            else if (c == '[')
                stack.push(c);
            else if (c == ')')
                if (stack.isEmpty())
                    return false;
                else if(stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            else if(c == ']')
                if(stack.isEmpty())
                    return false;
                else if(stack.peek() == '[')
                    stack.pop();
                else
                    return false;
        }
        return true;
    }


}
