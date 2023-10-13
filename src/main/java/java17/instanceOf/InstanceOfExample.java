package java17.instanceOf;

public class InstanceOfExample {

    public static void main(String[] args) {
        Object obj = "Pattern Matching for instanceof in Java!";

        // Traditional way
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println("Traditional: " + str.toUpperCase());
        }

        // New way (Java 16 and onwards)
        if (obj instanceof String s) {
            // s can be used directly and it is of type String here
            System.out.println("New Way: " + s.toLowerCase());
        }
    }
}
