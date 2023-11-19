package java17.sealedClasses;

public sealed abstract class Shape
        permits Circle, Rectangle {
    public abstract double area();
}


final class Circle extends Shape {
    private final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}


final class Rectangle extends Shape {
    private final double length, breadth;
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double area() {
        return length * breadth;
    }
}
