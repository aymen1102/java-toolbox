package general.modifiers.final_.variables;

/**
 * final on a variable: Once a variable has been declared as final, its value cannot be subsequently modified.
 * This is particularly useful for creating constants.
 */
class FinalExamples {

    private static final String finalString = "final";
    private static String editableString = "editable";

    public static void main(String[] args) {
        // finalString = "je modifie !";         Error : Cannot assign a value to final variable 'finalString'
        editableString = "edited !";
        System.out.println(editableString);
    }

}