package java8.defautmethods;

public class Bar implements Foo{

    public static void main(String[] args) {
        // call from interface instance
        Foo foo = new Bar();
        foo.defaultMethod();
        foo.display();

        // call from the interface
        Foo.staticMethod();
    }

    public void display() {
        System.out.println("Ici j'ai implémenté une méthode");
    }
}
