package oop.abstraction;

public class Main {
    public static void main(String[] args) {
        //Animal animal = new Animal();  // it is not possible to create an object of the Animal class

        Cat cat = new Cat();
        cat.sleep();    // simple method
        cat.eat();      // abstract method
        cat.walk();     // static method

        Dog dog = new Dog();
        dog.sleep();    // simple method
        dog.eat();      // abstract method
        dog.walk();     // static method
    }
}
