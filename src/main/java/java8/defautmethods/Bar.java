package java8.defautmethods;

public class Bar implements Foo{

    public static void main(String[] args) {
        // call from interface instance
        Foo foo = new Bar();
        foo.maMethodeParDefaut();
        foo.display();

        // call from the interface
        Foo.maMethodeStatic();
    }

    public void display() {
        System.out.println("Ici j'ai implémenté une méthode");
    }
}
