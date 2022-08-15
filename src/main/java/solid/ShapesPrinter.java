package solid;

import java.util.List;

public class ShapesPrinter {
    /**
    * Dependency Inversion : Components should depend on abstraction
    * not on concrete */
    /** bad practice */
    private  AreaCalculator areaCalculator
            = new AreaCalculator();

    /** good practice */
    private  final  IAreaCalculator iAreaCalculator;

    public ShapesPrinter(IAreaCalculator iAreaCalculator) {
        this.iAreaCalculator = iAreaCalculator;
    }

    public String json(List<Shape> shapes){
        return "{ShapesSum: %s}".formatted(areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes){
        return "shapes_sum,%s".formatted(areaCalculator.sum(shapes));
    }

}
