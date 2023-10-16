package solid.openClose;

/**
 * In this example, we apply the Open-Closed Principle by creating an interface Shape that defines a calculateArea
 * method to calculate the area of different geometric shapes.
 * Next, we have two classes, Circle and Rectangle, that implement this interface.
 * If we want to add new geometric shapes, we can create new classes that also implement the Shape interface without modifying the existing code.
 * Finally, the AreaCalculator class uses an array of shapes to calculate the sum of their areas, without needing to know the details of each specific shape.
 * Thus, our code is open for extension (adding new shapes) but closed for modification (existing classes are not altered).
 */
public class AreaCalculator {
    public double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}
