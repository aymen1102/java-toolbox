package algorithms.basics;

import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;


/*
https://www.w3resource.com/java-exercises/basic/index.php
 */
public class JavaBasics {
    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question9();
        question10();
        question11();
        question12();
        question13();
        question14();
        question15();
        question16();
        question17();
        question18();
        question19();
        question20();
        question21();
        question22();
        question23();
        question24();
        question25();
        question26();
        question27();
        question28();
        question29();
        question30();
        question31();
        question32();
        question33();
        question34();
        question35();
        question36();
        question37();
        question38();
        question39();
        question40();
        question41();
        question42();
        question43();
        question44();
        question45();
        question46();
        question47();
        question48();
        question49();
        question50();
        question51();
        question52();
        question53();
        question54();
        question55();
        question56();
        question57();
        question58();
        question59();
        question60();
//        question61();question62();question63();question64();question65();question66();question67();question68();question69();question70();
//        question71();question72();question73();question74();question75();question76();question77();question78();question79();question80();
//        question81();question82();
        question83();
        question84();
        question85();
        question86();
        question87();
        //question88();question89();question90();
//        question91();question92();question93();question94();question95();question96();question97();question98();question99();question100();
//        question101();question102();question103();question104();question105();question106();question107();question108();question109();question110();
    }


    static void question1() {
        System.out.println("-------------------------------------------------- Question 1 --------------------------------------------------");
        System.out.println("Hello !");
    }


    static void question2() {
        System.out.println("-------------------------------------------------- Question 2 --------------------------------------------------");
        System.out.println(74 + 36); //110
    }


    static void question3() {
        System.out.println("-------------------------------------------------- Question 3 --------------------------------------------------");
        System.out.println(50 / 3); //16
    }


    static void question4() {
        System.out.println("-------------------------------------------------- Question 4 --------------------------------------------------");
        System.out.println(-5 + 8 * 6); //43
        System.out.println((55 + 9) % 9); //1
        System.out.println(20 + (-3 * 5) / 8); //19
        System.out.println(5 + (15 / 3) * 2 - 8 % 3); //13
    }


    static void question5() {
        System.out.println("-------------------------------------------------- Question 5 --------------------------------------------------");
        int a = 25;
        int b = 5;
        System.out.println(a * b);
    }


    static void question6() {
        System.out.println("-------------------------------------------------- Question 6 --------------------------------------------------");
        int a = 12;
        int b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }


    static void question7() {
        System.out.println("-------------------------------------------------- Question 7 --------------------------------------------------");
        int a = 8;
        for (int i = 0; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + a * i);
        }
    }


    static void question8() {
        System.out.println("-------------------------------------------------- Question 8 --------------------------------------------------");
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }


    static void question9() {
        System.out.println("-------------------------------------------------- Question 9 --------------------------------------------------");
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
    }


    static void question10() {
        System.out.println("-------------------------------------------------- Question 10 --------------------------------------------------");
        System.out.println(4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
    }


    static void question11() {
        System.out.println("-------------------------------------------------- Question 11 --------------------------------------------------");
        double r = 7.5;
        System.out.println("Perimeter is = " + 2 * Math.PI * r);  //2*pi*r
        System.out.println("Area is = " + Math.PI * r * r); //pi*r²
    }


    static void question12() {
        System.out.println("-------------------------------------------------- Question 12 --------------------------------------------------");
        int x = 12;
        int y = 100;
        int z = 500;
        System.out.println("The average of numbers is = " + (x + y + z) / 3);
    }


    static void question13() {
        System.out.println("-------------------------------------------------- Question 13 --------------------------------------------------");
        double width = 5.6;
        double height = 8.5;
        System.out.println("Area is = " + width * height);
        System.out.println("Perimeter is = " + 2 * (height + width));
    }


    static void question14() {
        System.out.println("-------------------------------------------------- Question 14 --------------------------------------------------");
        for (int i = 0; i < 4; i++) {
            System.out.println("* * * * * * ==================================");
            System.out.println(" * * * * *  ==================================  ");
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("==============================================");
        }
    }


    static void question15() {
        System.out.println("-------------------------------------------------- Question 15 --------------------------------------------------");
        int x = 5;
        int y = 9;
        System.out.println("X value before swap = " + x);
        System.out.println("Y value before swap = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("X value after swap = " + x);
        System.out.println("Y value after swap = " + y);
    }


    static void question16() {
        System.out.println("-------------------------------------------------- Question 16 --------------------------------------------------");
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
    }


    static void question17() {
        System.out.println("-------------------------------------------------- Question 17 --------------------------------------------------");
        long binary1 = 10;
        long binary2 = 11;
        System.out.println("The first binary number: " + binary1);
        System.out.println("The second  binary number: " + binary2);
        int remainder = 0;
        int i = 0;
        int[] sum = new int[20];
        while (binary1 != 0 || binary2 != 0) {
            sum[i++] = (int) (binary1 % 10 + binary2 % 10 + remainder) % 2;
            remainder = (int) (binary1 % 10 + binary2 % 10 + remainder) / 2;
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if (remainder != 0) {
            sum[i++] = remainder;
        }
        i = i - 1;
        System.out.print("Sum of two binary numbers is = ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.println("\n");
    }


    static void question18() {
        System.out.println("-------------------------------------------------- Question 18 --------------------------------------------------");
    }


    static void question19() {
        System.out.println("-------------------------------------------------- Question 19 --------------------------------------------------");
    }


    static void question20() {
        System.out.println("-------------------------------------------------- Question 20 --------------------------------------------------");
    }


    static void question21() {
        System.out.println("-------------------------------------------------- Question 21 --------------------------------------------------");
    }


    static void question22() {
        System.out.println("-------------------------------------------------- Question 22 --------------------------------------------------");
    }


    static void question23() {
        System.out.println("-------------------------------------------------- Question 23 --------------------------------------------------");
    }


    static void question24() {
        System.out.println("-------------------------------------------------- Question 24 --------------------------------------------------");
    }


    static void question25() {
        System.out.println("-------------------------------------------------- Question 25 --------------------------------------------------");
    }


    static void question26() {
        System.out.println("-------------------------------------------------- Question 26 --------------------------------------------------");
    }


    static void question27() {
        System.out.println("-------------------------------------------------- Question 27 --------------------------------------------------");
    }


    static void question28() {
        System.out.println("-------------------------------------------------- Question 28 --------------------------------------------------");
    }


    static void question29() {
        System.out.println("-------------------------------------------------- Question 29 --------------------------------------------------");
    }


    static void question30() {
        System.out.println("-------------------------------------------------- Question 30 --------------------------------------------------");
    }


    static void question31() {
        System.out.println("-------------------------------------------------- Question 31 --------------------------------------------------");
        System.out.println("\nJava Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");
    }


    static void question32() {
        System.out.println("-------------------------------------------------- Question 32 --------------------------------------------------");
        int a = 25;
        int b = 39;
        if (a < b)
            System.out.println(a + "<" + b);
        if (a > b)
            System.out.println(a + ">" + b);
        if (a == b)
            System.out.println(a + "=" + b);
        if (a != b)
            System.out.println(a + "!=" + b);
    }


    static void question33() {
        System.out.println("-------------------------------------------------- Question 33 --------------------------------------------------");
        int digit = 25;
        int sum = 0;
        while (digit != 0) {
            int n = digit % 10;
            sum = sum + n;
            digit = digit / 10;
        }
        System.out.println("The sum of the digits is : " + sum);
    }


    static void question34() {
        System.out.println("-------------------------------------------------- Question 34 --------------------------------------------------");
    }


    static void question35() {
        System.out.println("-------------------------------------------------- Question 35 --------------------------------------------------");
    }


    static void question36() {
        System.out.println("-------------------------------------------------- Question 36 --------------------------------------------------");
    }


    static void question37() {
        System.out.println("-------------------------------------------------- Question 37 --------------------------------------------------");
        String input = "the quick brown fox";
        char[] chars = input.toCharArray();
        char[] reverseChar = new char[chars.length];
        int j = 0;
        System.out.print("Input a string: ");
        for (int i = chars.length - 1; i >= 0; i--) {
            reverseChar[j++] = chars[i];
        }
        System.out.println(reverseChar);
    }


    static void question38() {
        System.out.println("-------------------------------------------------- Question 38 --------------------------------------------------");
        String input = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        System.out.println("The string is : " + input);
        char[] chars = input.toCharArray();
        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;
        for (char aChar : chars) {
            if (Character.isAlphabetic(aChar))
                letters++;
            else if (Character.isSpaceChar(aChar))
                spaces++;
            else if (Character.isDigit(aChar))
                numbers++;
            else
                others++;
        }
        System.out.println("letter : " + letters);
        System.out.println("space : " + spaces);
        System.out.println("number : " + numbers);
        System.out.println("other : " + others);
    }


    static void question39() {
        System.out.println("-------------------------------------------------- Question 39 --------------------------------------------------");
        int n = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                for (int k = 1; k < 5; k++) {
                    if (i != j && j != k && i != k) {
                        System.out.printf("%d%d%d,", i, j, k);
                        n++;
                    }
                }
            }
        }
        System.out.println("\nTotal number of the three-digit-number is " + n);
    }


    /*A character set refers to the composite number of different characters that are being used and supported by a computer software and hardware.
    It consists of codes, bit pattern or natural numbers used in defining some particular character.*/
    static void question40() {
        System.out.println("-------------------------------------------------- Question 40 --------------------------------------------------");
        System.out.println("List of available character sets :");
        for (String s : Charset.availableCharsets().keySet()) {
            System.out.print(s + " ");
        }
        System.out.println("\n");
    }


    static void question41() {
        System.out.println("-------------------------------------------------- Question 41 --------------------------------------------------");
        char letter = 'Z';
        int ascii = letter;
        System.out.println("The ASCII value of " + letter + " is " + ascii);
    }


    static void question42() {
        System.out.println("-------------------------------------------------- Question 42 --------------------------------------------------");
    }


    static void question43() {
        System.out.println("-------------------------------------------------- Question 43 --------------------------------------------------");
        System.out.println("""
                Twinkle, twinkle, little star,
                        How I wonder what you are!
                            Up above the world so high,
                            Like a diamond in the sky.
                Twinkle, twinkle, little star,
                        How I wonder what you are""");
    }


    static void question44() {
        System.out.println("-------------------------------------------------- Question 44 --------------------------------------------------");
        int number = 5;
        System.out.println("Input number : " + number);

        System.out.printf("%d + %d%d + %d%d%d", number, number, number, number, number, number);
        System.out.println("\n");
    }


    static void question45() {
        System.out.println("-------------------------------------------------- Question 45 --------------------------------------------------");
    }


    static void question46() {
        System.out.println("-------------------------------------------------- Question 46 --------------------------------------------------");
        System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
    }


    static void question47() {
        System.out.println("-------------------------------------------------- Question 47 --------------------------------------------------");
        System.out.println(LocalDateTime.now());
    }


    static void question48() {
        System.out.println("-------------------------------------------------- Question 48 --------------------------------------------------");
        int i = 1;
        while (i < 100) {
            if (i % 2 == 1)
                System.out.print(i + ",");
            i++;
        }
        System.out.println("\n");
    }


    static void question49() {
        System.out.println("-------------------------------------------------- Question 49 --------------------------------------------------");
        int number = 20;
        System.out.println("Input number " + number);
        if (number % 2 == 0)
            System.out.println(1);
        else
            System.out.println(0);
    }


    static void question50() {
        System.out.println("-------------------------------------------------- Question 50 --------------------------------------------------");
        System.out.println("Divided by 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ",");
        }
        System.out.println("\nDivided by 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0)
                System.out.print(i + ",");
        }
        System.out.println("\nDivided by 3 & 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print(i + ",");
        }
        System.out.println();
    }


    static void question51() {
        System.out.println("-------------------------------------------------- Question 51 --------------------------------------------------");
        String number = "34";
        Integer numberConverted = Integer.valueOf(number);
        System.out.println(numberConverted);
    }


    static boolean question52() {
        System.out.println("-------------------------------------------------- Question 52 --------------------------------------------------");
        int a = 5;
        int b = 10;
        int c = 15;
        boolean result;
        System.out.println("the first number : " + a);
        System.out.println("the second number : " + b);
        System.out.println("the third number : " + c);
        if (a + b == c || a + c == b || b + c == a)
            result = true;
        else
            result = false;
        System.out.println("the result is : " + result);
        return result;
    }


    static boolean question53() {
        System.out.println("-------------------------------------------------- Question 53 --------------------------------------------------");
        int a = 5;
        int b = 10;
        int c = 15;
        boolean oneVerification = true;
        boolean result;
        if (oneVerification)
            result = c > b;
        else
            result = c > b && b > a;
        System.out.println("the result is : " + result);
        return result;
    }


    static void question54() {
        System.out.println("-------------------------------------------------- Question 54  --------------------------------------------------");
        int a = 5;
        int b = 10;
        int c = 15;
        System.out.println((a % 10 == b % 10) || (a % 10 == c % 10) || (c % 10 == b % 10));
    }


    static void question55() {
        System.out.println("-------------------------------------------------- Question 55  --------------------------------------------------");
        int total = 86399;
        System.out.println("Input seconds : " + total);
        int seconds = total % 60;
        int hours = total / 60; // en secondes
        int minutes = hours % 60;
        hours = hours / 60; // en heures
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }


    static void question56() {
        System.out.println("-------------------------------------------------- Question 56  --------------------------------------------------");
        int x = 5;
        int y = 20;
        int divisibleBy = 3;
        long count = IntStream.range(x, y)
                .filter(number -> number % divisibleBy == 0)
                .count();
        System.out.println(count);
    }


    static void question57() {
        System.out.println("-------------------------------------------------- Question 57  --------------------------------------------------");
        int number = 25;
        int factors = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors++;
                System.out.println(number + " is divisible by " + i);
            }
        }
        System.out.println("The number of factors is : " + factors);
    }


    static void question58() {
        System.out.println("-------------------------------------------------- Question 58  --------------------------------------------------");
    }


    static void question59() {
        System.out.println("-------------------------------------------------- Question 59  --------------------------------------------------");
        String input = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG. ";
        System.out.println(input.toLowerCase());
    }


    static void question60() {
        System.out.println("-------------------------------------------------- Question 60  --------------------------------------------------");
        String input = "The quick brown fox jumps over the lazy dog.";
        List<String> wordsList = new ArrayList<>();
        while (input.contains(" ")) {
            wordsList.add(input.substring(0, input.indexOf(" ")));
            input = input.substring(input.indexOf(" ") + 1);
        }
        System.out.println(wordsList.get(wordsList.size() - 1));
    }

    static void question83() {
        System.out.println("-------------------------------------------------- Question 83  --------------------------------------------------");
        int[] array1 = {1, 3, -5, 4};
        int[] array2 = {1, 4, -5, -2};
        int[] result = new int[4];
        System.out.println("Array 1 :" + Arrays.toString(array1));
        System.out.println("Array 2 :" + Arrays.toString(array2));
        for (int i = 0; i < array1.length; i++) {
            int number1 = array1[i];
            int number2 = array2[i];
            result[i] = number1 * number2;
        }
        System.out.println("Result = " + Arrays.toString(result));
    }

    static void question84() {
        System.out.println("-------------------------------------------------- Question 83  --------------------------------------------------");
        String word = "Python";
        int length = word.length();
        String substring = word.substring(length - 3, length);
        System.out.println(substring + word + substring);
    }


    static void question85() {
        System.out.println("-------------------------------------------------- Question 85  --------------------------------------------------");
        String welcomeStatement = "Hello how are you ?";
        System.out.println(welcomeStatement.startsWith("Hello"));
    }


    static void question86() {
        System.out.println("-------------------------------------------------- Question 86  --------------------------------------------------");
        int n = 10;
        while (n != 1) {
            if (n % 2 == 0)
                n = n / 2;
            else
                n = (n * 3 + 1)/2;
        }
        System.out.println("value of n :"+n);
    }


    static void question87(){
        System.out.println("-------------------------------------------------- Question 87  --------------------------------------------------");
        Integer number = 956;
        Integer sum = 0;
        // calculate the sum of it's digit
        String numberString = number.toString();
        char[] chars = numberString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            sum = sum + Integer.valueOf(chars[i]);
        }
        System.out.println("The sum is : "+sum);

        // print sun numbers in english
    }
}
