package solid;

public class NoShape implements Shape {
    /**
     *  This method cannot caculate the area
     *  This break the rule of Liskov
     *  Liskov Substitution : This means that every subclass or
     *  derived class should be substituble for their
     *  base or parent class
     *  */
    @Override
    public double area() {
        throw new IllegalStateException("Cannot calculate area");
    }
}
