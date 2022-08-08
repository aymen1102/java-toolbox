package oop.polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();

        animal.eat();
        cat.eat();
        dog.eat();
    }
}
