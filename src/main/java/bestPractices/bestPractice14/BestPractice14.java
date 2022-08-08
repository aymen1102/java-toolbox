package bestPractices.bestPractice14;

/**
 * Use Primitive Types Wherever Possible
 * Usage of primitive types over objects is beneficial since the primitive type data is stored on stack
 * memory and the objects are stored on heap memory.
 * If possible, we can use primitive types instead of objects since data access from stack memory is faster
 * than heap memory.
 * So it is always beneficial to use int over Integer or double over Double.
 */
public class BestPractice14 {
    public static void main(String[] args) {

        /**Bad habit - Non Primitive data types */
        Byte byteNumber = 127;
        Short shortNumber = 32_767;
        Integer integerNumber = 1;
        Long longNumber = 9_223_372_036_854_775_807L;

        Double doubleNumber_ = 4.0d;
        Float floatNumber_ = 6.0f;

        Boolean isBoolean = true;
        Character letter = 'g';
        String name = "Adrien";

        /**Good habit - Primitive data types */
        byte minByte = -128;
        byte maxByte = 127;     //1 byte
        System.out.println("le type byte est entre "+minByte+" et "+maxByte);

        short minShort = -32_768;
        short maxShort = 32_767;  //2 bytes
        System.out.println("le type short est entre "+minShort+" et "+maxShort);

        int minInt = -2_147_483_648;
        int maxInt = 2_147_483_647;   //4 bytes
        System.out.println("le type int est entre "+minInt+" et "+maxInt);

        long minLong = -9_223_372_036_854_775_808L;
        long maxLong =  9_223_372_036_854_775_807L;    //8 bytes
        System.out.println("le type long est entre "+minLong+" et "+maxLong);

        float floatNumber = 3.14f;    // 4 bytes
        System.out.println(floatNumber);

        double doubleNumber = 3.14d;    //8 bytes
        System.out.println(doubleNumber);

        boolean isTrue = true;
        System.out.println(isTrue);

        char charachter = '@';
        System.out.println(charachter);



    }

}
