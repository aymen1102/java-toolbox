package oop.inheritance;

/**
 * Java Inheritance (Subclass and Superclass)
 * In Java, it is possible to inherit attributes and methods from one class to another.
 * We group the "inheritance concept" into two categories:
 * subclass (child) - the class that inherits from another class
 * superclass (parent) - the class being inherited from
 * To inherit from a class, use the extends keyword.
 * Why And When To Use "Inheritance"?
 * It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.
 */
public class Car extends Vehicle {
    public static void main(String[] args) {
        Car car = new Car();
        car.sonner();   //Tuuuuut.
        System.out.println(car.brand);  //Mercedes
    }
}
