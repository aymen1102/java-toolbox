package general.variables.reference.String;

/**
 * Java Strings are Immutable
 * In Java, strings are immutable.
 * This means, once we create a string, we cannot change that string.
 */
public class StringExample {
    public static void main(String[] args) {
        // create a string
        String first = "Hello ";
        String second = "world !";
        String third = " :D";

        System.out.println("String: " + first); //String: Hello

        // get the length of greet
        System.out.println("Length: " + first.length());  // 6
        // join two strings
        System.out.println("Joined String: " + first.concat(second));  //Joined String: Hello world !
        // compare two strings
        System.out.println("Strings first and second are equal: " + first.equals(second)); //Strings first and second are equal: false
        // substring string
        System.out.println(first.substring(3));  //lo
        // contains
        System.out.println(first + " contains : " + first.contains("Hel"));  // Hello  contains : true
        // charAt
        System.out.println("charAt[3] : " + first.charAt(3));  // l
        System.out.println("charAt[3] : " + first.charAt(3));  // l
        // use the escape character
        String example = "This is the \"String\" class.";  // This is the "String" class.
        System.out.println(example);
        //Java Strings are Immutable
        //Here, we are using the concat() method to add another string World to the previous string.
        //It looks like we are able to change the value of the previous string. However, this is not true.
        System.out.println("Java Strings are Immutable: " + first.concat(second)); //Java Strings are Immutable: Hello world !
    }
}
