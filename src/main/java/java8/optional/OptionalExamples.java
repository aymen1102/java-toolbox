package java8.optional;

import java.util.Optional;

public class OptionalExamples {
    public static void main(String[] args) {

        String[] str = new String[10];

        //Exemple 1   
        System.out.println("Exemple 1 :");
        //String lowercaseString0 = str[5].toLowerCase();
        //System.out.println(lowercaseString0); //NullPointerException

        Optional<String> checkIfNull1 = Optional.ofNullable(str[5]);
        if (checkIfNull1.isPresent()){
            String lowercaseString1 = str[5].toLowerCase();
            System.out.println(lowercaseString1);
        } else {
            System.out.println("String value is not Present");
        }

        //Exemple 2
        System.out.println("Exemple 2 :");
        str[5] = "5éme élement string dans le tableau";
        Optional<String> checkIfNull2 = Optional.ofNullable(str[5]);
        checkIfNull2.ifPresent(System.out::println);
        System.out.println(checkIfNull2.get());

    }
}
