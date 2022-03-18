package classe.interne;

public class MainClass {

    public static void main(String[] args) {
        // First call
        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
        innerClass.show(); // Emir

        // Second call
        OuterClass outerClass = new OuterClass();
        outerClass.showFromInnerClass(); // Emir
    }

}
