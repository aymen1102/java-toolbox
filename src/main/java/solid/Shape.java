package solid;

public interface Shape {
    double area();

    /**
     * This break Interface segregation principle
     * we should separate this method in another interface
     * because Circle doesn't implement 3D shapes
     * */
    //double volume();
}
