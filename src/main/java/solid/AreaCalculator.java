package solid;

import java.util.List;

public class AreaCalculator implements IAreaCalculator{

    public int sum(List<Shape> shapes){
        int sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            sum += shapes.get(i).area();
        }
        return sum;
    }

    /** Open Closed : This methods should be replaced by the
     * other method*/
    public int badSum(List<Object> shapes){
        int sum =0;
        for (int i = 0; i < shapes.size(); i++) {
            Object shape = shapes.get(i);
            if(shape instanceof Square)
                sum+= Math.pow(((Square) shape).getLength(),2);
            if(shape instanceof Circle)
                sum+= Math.PI * Math.pow(((Circle) shape).getRadius(),2);
            if(shape instanceof Cube)
                sum+= 100;
        }
        return sum;
    }


    /** Single responsability : This methods should be transferred
     * in a new class = ShapesPrinter*/
    public String json(int sum){
        return "{ShapesSum: %s}".formatted(sum);
    }
    public String csv(int sum){
        return "shapes_sum,%s".formatted(sum);
    }

}
