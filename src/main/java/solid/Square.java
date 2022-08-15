package solid;

public class Square implements Shape{
    private final int radius;

    public Square(int radius) {
        this.radius = radius;
    }

    public int getLength() {
        return radius;
    }

    @Override
    public double area() {
        return Math.pow(getLength(),2);
    }
}
