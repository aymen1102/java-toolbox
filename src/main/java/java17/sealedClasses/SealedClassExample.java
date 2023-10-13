package java17.sealedClasses;

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
