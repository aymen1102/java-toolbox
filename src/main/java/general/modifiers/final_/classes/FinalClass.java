package general.modifiers.final_.classes;

/**
 * A class declared as final cannot be extended, thus preventing inheritance.
 * This is useful when you want the class to remain unchanged and not be subclassed.
 */
final class FinalClass {

    public String text = "Final class";

    public String getFinal() {
        return "Final !";
    }
}
