package algorithms;

import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.TimeZone;
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
        question5(25, 5);
        question6(125, 24);
        question7(8);
        question8();
        question9();
        question10();
        question11(7.5);
        question12(12, 100, 500);
        question13(5.6, 8.5);
        question14();
        question15(5, 9);
        question16();
        question17(10, 11);
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
        question33(25);
        question37();
        question38();
        question39();
        question40();
        question41();
        question42();
        question43();
        question44(5);
        question45();
        question46();
        question47();
        question48();
        question49(20);
        question50();
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

    static void question5(int a, int b) {
        System.out.println("-------------------------------------------------- Question 5 --------------------------------------------------");
        System.out.println(a * b);
    }

    static void question6(int a, int b) {
        System.out.println("-------------------------------------------------- Question 6 --------------------------------------------------");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }

    static void question7(int a) {
        System.out.println("-------------------------------------------------- Question 7 --------------------------------------------------");
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

    static void question11(double r) {
        System.out.println("-------------------------------------------------- Question 11 --------------------------------------------------");
        System.out.println("Perimeter is = " + 2 * Math.PI * r);  //2*pi*r
        System.out.println("Area is = " + Math.PI * r * r); //pi*r²
    }

    static void question12(int x, int y, int z) {
        System.out.println("-------------------------------------------------- Question 12 --------------------------------------------------");
        System.out.println("The average of numbers is = " + (x + y + z) / 3);
    }

    static void question13(double width, double height) {
        System.out.println("-------------------------------------------------- Question 13 --------------------------------------------------");
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

    static void question15(int x, int y) {
        System.out.println("-------------------------------------------------- Question 15 --------------------------------------------------");
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
        System.out.println(" +---------------------------------------------------+ ");
    }

    static void question17(long binary1, long binary2) {
        System.out.println("-------------------------------------------------- Question 17 --------------------------------------------------");
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
        System.out.println("\nJava Version: "+System.getProperty("java.version"));
        System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
        System.out.println("Java Home: "+System.getProperty("java.home"));
        System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
    }

    static void question32() {
        System.out.println("-------------------------------------------------- Question 32 --------------------------------------------------");
        int a = 25;
        int b = 39;
        if(a<b)
            System.out.println(a+"<"+b);
        if(a>b)
            System.out.println(a+">"+b);
        if(a==b)
            System.out.println(a+"="+b);
        if(a!=b)
            System.out.println(a+"!="+b);
    }

    static void question33(int digit) {
        System.out.println("-------------------------------------------------- Question 33 --------------------------------------------------");
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
        System.out.println("The string is : "+ input);
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
        System.out.println("letter : "+letters);
        System.out.println("space : "+spaces);
        System.out.println("number : "+numbers);
        System.out.println("other : "+others);
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

    static void question40() {
        System.out.println("-------------------------------------------------- Question 40 --------------------------------------------------");
        System.out.println("List of available character sets :");
        for (String s:Charset.availableCharsets().keySet()) {
            System.out.print(s+" ");
        }
        System.out.println("\n");
    }

    static void question41() {
        System.out.println("-------------------------------------------------- Question 41 --------------------------------------------------");
        char letter = 'Z';
        int ascii = letter;
        System.out.println("The ASCII value of "+letter+" is "+ascii);
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

    static void question44(int number) {
        System.out.println("-------------------------------------------------- Question 44 --------------------------------------------------");
        System.out.println("Input number : " + number);

        System.out.printf("%d + %d%d + %d%d%d", number, number, number, number, number, number);
        System.out.println("\n");
    }

    static void question45() {
        System.out.println("-------------------------------------------------- Question 45 --------------------------------------------------");
    }

    static void question46() {
        System.out.println("-------------------------------------------------- Question 46 --------------------------------------------------");
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

    static void question49(int number) {
        System.out.println("-------------------------------------------------- Question 49 --------------------------------------------------");
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
    }

}
