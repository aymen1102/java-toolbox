package solid;

public class ShapesPrinter {

    public String json(int sum){
        return "{ShapesSum: %s}".formatted(sum);
    }

    public String csv(int sum){
        return "shapes_sum,%s".formatted(sum);
    }

}
