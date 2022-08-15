package solid;

import java.util.List;

/**
 * Solid principles :
 * Single responsability : Each class should have one purpose
 * and not be filled with excessive functionality
 *
 * Open Closed : Classes should be open for extension,
 * closed for modification
 *
 * Liskov Substitution
 */
public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        ShapesPrinter printer = new ShapesPrinter();
        List<Object> shapes = List.of(circle,square);
        int sum = areaCalculator.sum(shapes);
        System.out.println(printer.json(sum));
        System.out.println(printer.csv(sum));
    }
}
