package oop.encapsulation;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Aymen");
        //System.out.println(person.name); // error
        System.out.println(person.getName()); //Aymen
    }
}
