package solid.openClose;

/**
 Open for Extension: This part of the principle suggests that the behavior of a module can be extended.
 That means you should be able to add new functionality or components to the module without altering its existing code.
 Essentially, it's about making the module adaptable or extendable to new situations or requirements.
 Closed for Modification: This aspect implies that once a module has been developed and tested,
 its existing code should not be modified to add new functionality. Instead, its existing behavior
 can be extended by adding new code, not by changing the old code that is already working.
 */
public class AreaCalculator {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        Rectangle rectangle = new Rectangle(5,2);
        Shape[] shapes = {circle, rectangle};
        System.out.println(calculateTotalArea(shapes));
    }

    public static double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}
