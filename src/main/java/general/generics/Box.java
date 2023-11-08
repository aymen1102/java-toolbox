package general.generics;

public class Box<T> {
    // T stands for "Type"
    private T type;

    public void set(T type) {
        this.type = type;
    }

    public T get() {
        return type;
    }

    public static void main(String[] args) {
        // Create instance of generic class Box for Integers
        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);
        Integer someInteger = integerBox.get();
        System.out.println(someInteger);

        // Create instance of generic class Box for Strings
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello World");
        String someString = stringBox.get();
        System.out.println(someString);
    }
}