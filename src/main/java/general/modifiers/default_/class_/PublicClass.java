package general.modifiers.default_.class_;

// This class has default access, meaning it is package-private
class DefaultClass {
    void display() {
        System.out.println("Hello, I have default access!");
    }
}

public class PublicClass {
    public static void main(String[] args) {
        DefaultClass obj = new DefaultClass();
        obj.display(); // This will work if PublicClass is in the same package as DefaultClass
    }
}