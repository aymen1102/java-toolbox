package java8.optional;

import java.util.Optional;

/**
 * Optional is a container object used to contain not-null objects. Optional object
 * is used to represent null with absent value. This class has various utility methods
 * to facilitate code to handle values as ‘available’ or ‘not available’ instead of checking null values.
 * It is introduced in Java 8 and is similar to what Optional is in Guava.
 */
public class     OptionalExamples {
    public static void main(String[] args) {

        System.out.println("Exemple 1");
        Optional<String> gender = Optional.of("MALE");
        System.out.println(gender); // Optional[MALE]
        System.out.println(gender.get());  //MALE
        System.out.println(Optional.empty());  //Optional.empty


        System.out.println("\n");
        System.out.println("Exemple 2");
        String answer1 = "YES";
        String answer2 = null;
        System.out.println(Optional.ofNullable(answer1)); // Optional[YES]
        System.out.println(Optional.ofNullable(answer2)); // Optional.empty
        /*
        System.out.println(Optional.of(answer2)); // NullPointerException
        */
        System.out.println(Optional.ofNullable(answer1).isPresent()); // true
        System.out.println(Optional.ofNullable(answer2).isPresent()); // false

        System.out.println(Optional.ofNullable(answer1).get()); // YES
        //System.out.println(Optional.ofNullable(answer2).get());


        System.out.println("\n");
        System.out.println("Exemple 3 :");
        String[] cars = new String[4];
        cars[0] = "Mercedes";
        cars[1] = "Renault";
        cars[3] = "Citroen";

        Optional<String> car2 = Optional.ofNullable(cars[2]);
        if (car2.isPresent()){
            String lowercaseString1 = cars[2].toLowerCase();
            System.out.println(lowercaseString1);
        } else {
            System.out.println("String value is not Present"); //String value is not Present
        }

        cars[2] = "Bugatti";
        Optional<String> checkIfNull0 = Optional.ofNullable(cars[2]);
        checkIfNull0.ifPresent(System.out::println); //Bugatti
        System.out.println(checkIfNull0.get());        //Bugatti
    }
}
