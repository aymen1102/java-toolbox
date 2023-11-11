package general.operators.equal;

/**
 * The == operator compares whether two object references point to the same memory address, i.e. the same object in memory.
 * In contrast, the equals() method is used to compare the contents of two objects.
 * However, it's important to note that the default equals() method
 * (inherited from the Object class) also compares references, just like ==.
 * But for classes such as String, Integer, Date, etc., the equals() method is redefined to check content.
 * So, if you want content-based comparison for your own objects, you need to redefine (or override) the equals()
 * method in your class.
 */
public class EqualExample {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = s1;

        // Reference comparison using '=='
        System.out.println("s1 == s2 : " + (s1 == s2)); // false, because s1 and s2 point to different objects in memory
        System.out.println("s1 == s3 : " + (s1 == s3)); // true, because s3 is assigned the same reference as s1

        // Content comparison using '.equals()'
        System.out.println("s1.equals(s2) : " + s1.equals(s2)); // true, because s1 and s2 have the same content
        System.out.println("s1.equals(s3) : " + s1.equals(s3)); // true, because s1 and s3 have the same content
    }
}
