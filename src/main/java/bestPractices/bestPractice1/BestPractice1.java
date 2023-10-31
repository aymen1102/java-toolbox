package bestPractices.bestPractice1;

/** Use StringBuilder or StringBuffer for String Concatenation  :
 * The java best practice, in that case, would be using “StringBuilder” or “StringBuffer”.
 * These built-in functions modify a String without creating intermediate
 * String objects saving processing time and unnecessary memory usage.
 * StringBuilder : asynchronous
 * StringBuffer  : synchronous
 * */
public class BestPractice1 {

    public static void main(String[] args) {
        User user = new User("Antoine", 28);

        /** bad habit */
        String requestString = "INSERT INTO USERS (name,age)";
        requestString += " values ('"+ user.getName();
        requestString += "',"+ user.getAge();
        requestString += ")";
        System.out.println(requestString);

        /**
         * best practice
         * */
        StringBuilder requestStringBuilder = new StringBuilder("INSERT INTO USERS (name,age)");
        requestStringBuilder.append(" values ('")
                .append(user.getName())
                .append("',")
                .append(user.getAge())
                .append(")");
        System.out.println(requestStringBuilder);
    }
}



