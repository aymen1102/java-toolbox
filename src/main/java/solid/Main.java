package solid;

import java.util.List;

/**
 * Solid principles :
 * Single responsability : Each class should have one purpose
 * and not be filled with excessive functionality
 *
 * Open Closed : Classes should be open for extension,
 * closed for modification, you should not have to rewrite
 * an existing class for implementing new feature
 *
 * Liskov Substitution : This means that every subclass or
 * derived class should be substituble for their
 * base or parent class
 *
 * Interface segregation : Interface should not force classes to
 * implement what they can't do. Large interfaces should be divided
 * into small ones.
 *
 * Dependency Inversion : Components should depend on abstraction
 * not on concrete
 */
public class Main {
    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();
        Shape noShape = new NoShape();
        ShapesPrinter printer = new ShapesPrinter(areaCalculator);
        List<Shape> shapes = List.of(circle,square,cube);
        int sum = areaCalculator.sum(shapes);
        System.out.println(printer.json(shapes));
        System.out.println(printer.csv(shapes));
    }
}
