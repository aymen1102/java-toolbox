package java11.stringAPI;

public class StringAPIExamples {

    public static void main(String[] args) {

        /** isBlank() */
        System.out.println(" ".isBlank()); //true

        /** strip() */
        System.out.println(" Ay men ".strip().replace(" ", "*")); // Ay*men
        System.out.println(" Ay men ".stripLeading().replace(" ", "*")); // Ay*men*
        System.out.println(" Ay men ".stripTrailing().replace(" ", "*")); // *Ay*men

        /** trim() */
        String statement = "                    I love Java       ";
        System.out.println(statement.trim());       //I love Java

        /** lines() */


        "Line1\nLine2\nLine3".lines().forEach(System.out::println); //Line1 Line2 Line3

        /** transform() */
        System.out.println((String) "Aymen".transform(s -> s.substring(2))); // men

        /** formatted() */
        System.out.println("My name is %s . My age is %d".formatted("Aymen", 29)); // My name is Aymen . My age is 29

        /** repeat() */
        System.out.println("La".repeat(3));   // LaLaLa


    }
}
