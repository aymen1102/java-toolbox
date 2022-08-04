package java11.stringFeatures;

public class StringFeaturesExamples {

    public static void main(String[] args) {
        /** isBlank() */
        System.out.println(" ".isBlank()); //true

        /** strip() */
        System.out.println(" Ay men ".strip().replace(" ","*")); // Ay*men
        System.out.println(" Ay men ".stripLeading().replace(" ","*")); // Ay*men*
        System.out.println(" Ay men ".stripTrailing().replace(" ","*")); // *Ay*men

        /** lines() */
        "Line1\nLine2\nLine3".lines().forEach(System.out::println); //Line1 Line2 Line3

        System.out.println((String) "Aymen".transform(s -> s.substring(2))); // men

        System.out.println("My name is %s . My age is %d".formatted("Aymen",29)); // My name is Aymen . My age is 29

    }
}
