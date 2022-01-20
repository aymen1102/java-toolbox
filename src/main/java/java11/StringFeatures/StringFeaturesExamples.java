package java11.StringFeatures;

public class StringFeaturesExamples {

    public static void main(String[] args) {
        System.out.println(" ".isBlank()); //true

        System.out.println(" Ay men ".strip().replace(" ","*")); // Ay*men
        System.out.println(" Ay men ".stripLeading().replace(" ","*")); // Ay*men*
        System.out.println(" Ay men ".stripTrailing().replace(" ","*")); // *Ay*men

        "Line1\nLine2\nLine3".lines().forEach(System.out::println); //Line1 Line2 Line3

        System.out.println((String) "Aymen".transform(s -> s.substring(2))); // men

        System.out.println("My name is %s . My age is %d".formatted("Aymen",29)); // My name is Aymen . My age is 29

    }
}
