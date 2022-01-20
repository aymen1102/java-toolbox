package mot;

class FinalExamples {

    private static final String finalString = "final";
    private static String modifiableString = "modifiable";

    public static void main(String[] args) {
        // finalString = "je modifie !";         Error : Cannot assign a value to final variable 'finalString'
        modifiableString = "je modifie !";
        System.out.println(modifiableString);
    }

}