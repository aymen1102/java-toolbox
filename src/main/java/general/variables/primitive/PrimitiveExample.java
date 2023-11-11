package general.variables.primitive;

/**
 * Nature: Integer is a wrapper class in Java for the primitive type int. Integer is therefore an object, whereas int is a primitive type.
 * Methods: The Integer class provides many useful methods for processing integers. These methods are not available with the primitive int type.
 * Storage: int stores the numerical value directly, while Integer stores a reference to a memory location where the value is stored.
 * Memory and Performance: A primitive variable like int generally consumes less memory and is faster to access than its object
 * counterpart, Integer. This is because objects have an additional overhead for storing metadata.
 * Nullability: Primitive types, such as int, always have a value and can never be null.
 * In contrast, Integer is an object and can therefore have a null value.
 * Usage: Primitive types are generally used when performance and memory are critical, while objects,
 * such as Integer, offer greater flexibility, particularly thanks to the possibility of using them in collections and generic methods.
 */
public class PrimitiveExample {

    public static void main(String[] args) {
        /** Primitive data types */
        byte minByte = -128;
        byte maxByte = 127;     //1 byte
        System.out.println("le type byte est entre " + minByte + " et " + maxByte);

        short minShort = -32_768;
        short maxShort = 32_767;  //2 bytes
        System.out.println("le type short est entre " + minShort + " et " + maxShort);

        int minInt = -2_147_483_648;
        int maxInt = 2_147_483_647;   //4 bytes
        System.out.println("le type int est entre " + minInt + " et " + maxInt);

        long minLong = -9_223_372_036_854_775_808L;
        long maxLong = 9_223_372_036_854_775_807L;    //8 bytes
        System.out.println("le type long est entre " + minLong + " et " + maxLong);

        float floatNumber = 3.14f;    // 4 bytes
        System.out.println(floatNumber);

        double doubleNumber = 3.14d;    //8 bytes
        System.out.println(doubleNumber);

        boolean isTrue = true;
        System.out.println(isTrue);

        char charachter = '@';
        System.out.println(charachter);


        /** Non Primitive data types */
        Byte byteNumber = 127;
        Short shortNumber = 32_767;
        Integer integerNumber = 1;
        Long longNumber = 9_223_372_036_854_775_807L;

        Double doubleNumber_ = 4.0d;
        Float floatNumber_ = 6.0f;

        Boolean isBoolean = true;
        Character letter = 'g';
        String name = "Adrien";
    }

}
