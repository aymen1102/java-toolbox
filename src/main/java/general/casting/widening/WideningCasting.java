package general.casting.widening;

/**
 * Type casting is when you assign a value of one primitive data type to another type.
 * In Java, there are two types of casting:
 * Widening Casting (automatically) - converting a smaller type to a larger type size
 * byte -> short -> char -> int -> long -> float -> double
 * Narrowing Casting (manually) - converting a larger type to a smaller size type
 * double -> float -> long -> int -> char -> short -> byte
 */
public class WideningCasting {
    public static void main(String[] args) {
        int intNumber = 8454;
        double doubleNumber = intNumber;   // Automatic casting
        System.out.println(intNumber);
        System.out.println(doubleNumber);
    }
}
