package general.casting.narrowing;

/**
 * Type casting is when you assign a value of one primitive data type to another type.
 * In Java, there are two types of casting:
 * Widening Casting (automatically) - converting a smaller type to a larger type size
 * byte -> short -> char -> int -> long -> float -> double
 * Narrowing Casting (manually) - converting a larger type to a smaller size type
 * double -> float -> long -> int -> char -> short -> byte
 */
public class NarrowingCasting {
    public static void main(String[] args) {
        double doubleNumber = 5246.654d;
        int intNumber = (int) doubleNumber;

        System.out.println(doubleNumber);
        System.out.println(intNumber);
    }
}
