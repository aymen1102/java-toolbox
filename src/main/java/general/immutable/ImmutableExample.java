package general.immutable;

import java.util.List;

/**
 Immutability is a design principle in Java that suggests once an object is created, its state should not be altered.
 This concept leads to the creation of objects that are inherently thread-safe, easier to understand, and less prone to errors.
 To create an immutable object in Java, you typically:
 Declare the class as final so it can't be extended.
 Make all of the class fields private and final.
 Provide a constructor that sets all fields when creating an instance.
 Do not provide setters or any methods that alter the fields.
 If the class has any fields that refer to mutable objects:
 Ensure exclusive access to these objects.
 Do not provide methods to modify these objects.
 Make defensive copies of the objects to prevent the original mutable object from being changed.
 The String class is a primary example of immutability in Java.
 When you manipulate a String, you're not changing the original object but creating a new String instance.
 */
public class ImmutableExample {

    public static void main(String[] args) {
        String originalString = "Hello";
        System.out.println("Original String: " + originalString);
        // Attempt to modify the original String
        String modifiedString = originalString.concat(", World!");
        System.out.println("Modified String: " + modifiedString);

        // Check reference equality
        if (originalString == modifiedString) {
            System.out.println("Both are same references.");
        } else {
            System.out.println("Different references, proving immutability.");
        }

        // Check content equality
        if (originalString.equals(modifiedString)) {
            System.out.println("Both have same content.");
        } else {
            System.out.println("Different content.");
        }
    }
}
