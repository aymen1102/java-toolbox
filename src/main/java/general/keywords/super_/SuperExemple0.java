package general.keywords.super_;

class A {
    String name = "Antoine";
}

class B extends  A{
    String name = "Beatrice";
    void showName(){
        System.out.println(name); //Beatrice
        System.out.println(super.name); //Antoine
    }
}

public class SuperExemple0 {
    public static void main(String[] args) {
        B b = new B();
        b.showName();
    }
}
