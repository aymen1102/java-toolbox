package general.modifiers.default_.method;

public class Bar implements Foo {

    public static void main(String[] args) {
        // call from interface instance
        Foo foo = new Bar();
        foo.defaultMethod();
        foo.simpleMethod();

        // call from the interface
        Foo.staticMethod();
    }

    public void simpleMethod() {
        System.out.println("Here, i implemented a simple method");
    }
}
