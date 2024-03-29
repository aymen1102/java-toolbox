package general.keywords.this_;

/**
 * The this keyword in Java is a reference to the current object — the object whose method or constructor is being called.
 * You can use this to:
 * Differentiate between instance variables and parameters with the same name.
 * Pass the current object as a parameter to another method.
 * Call another constructor from a constructor.
 */
public class ThisExamples {

    public String name = "AYMEN";

    public static void main(String[] args) {
        ThisExamples thisExamples = new ThisExamples();
        System.out.println(thisExamples.setName("BAROUDI")); //AYMEN
    }

    public String setName(String name) {
        return this.name;
    }
}
