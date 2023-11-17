package java17.sealedClasses;

/**
 * Sealed classes in Java 17 are classes that have strict control over their inherited classes.
 * This means that a sealed class explicitly declares which other classes can inherit from it.
 * Motivation: The idea is to provide a higher level of consistency and encapsulation by limiting
 * inheritance to a predefined set of classes.
 * Syntax: Use the sealed keyword in the class declaration, followed by the permits keyword and
 * the list of classes allowed to extend the sealed class.
 * Advantages:
 * Encapsulation: Better control over inheritance.
 * Type safety: The compiler can check completeness, for example, in a switch on types.
 * Ease of maintenance: Less risk of a class being misused or inappropriately extended.
 */
public class SealedClassExample {

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 5);

        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());

        describeShape(circle);
        describeShape(rectangle);
    }

    private static void describeShape(Shape shape) {
        System.out.print("The shape is ");
        if (shape instanceof Circle) {
            System.out.println("a Circle.");
        } else if (shape instanceof Rectangle) {
            System.out.println("a Rectangle.");
        } else {
            System.out.println("of an unknown type.");
        }
    }
}
