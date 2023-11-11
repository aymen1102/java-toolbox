package general.variables.reference.bigDecimal;

import java.math.BigDecimal;

/**
 * .NET and Java also have Decimal/BigDecimal class that has higher precision than double.
 * For more accurate calculations like in financial and banking applications, Decimal is used because it further reduces rounding errors.
 * The BigDecimal class provides operations on double numbers for arithmetic, scale handling, rounding, comparison,
 * format conversion and hashing. It can handle very large and very small floating point numbers with great precision
 * but compensating with the time complexity a bit.
 * A BigDecimal consists of a random precision integer unscaled value and a 32-bit integer scale. If greater than or equal to zero,
 * the scale is the number of digits to the right of the decimal point.
 * If less than zero, the unscaled value of the number is multiplied by 10^(-scale).
 */
public class BigDecimalExample {
    public static void main(String[] args) {
        // Create two new BigDecimals
        BigDecimal bd1 =
                new BigDecimal("124567890.0987654321");
        BigDecimal bd2 =
                new BigDecimal("987654321.123456789");

        // Addition of two BigDecimals
        bd1 = bd1.add(bd2);
        System.out.println("BigDecimal1 = " + bd1);

        // Multiplication of two BigDecimals
        bd1 = bd1.multiply(bd2);
        System.out.println("BigDecimal1 = " + bd1);

        // Subtraction of two BigDecimals
        bd1 = bd1.subtract(bd2);
        System.out.println("BigDecimal1 = " + bd1);

        // Division of two BigDecimals
        bd1 = bd1.divide(bd2);
        System.out.println("BigDecimal1 = " + bd1);

        // BigDecima1 raised to the power of 2
        bd1 = bd1.pow(2);
        System.out.println("BigDecimal1 = " + bd1);

        // Negate value of BigDecimal1
        bd1 = bd1.negate();
        System.out.println("BigDecimal1 = " + bd1);
    }
}
