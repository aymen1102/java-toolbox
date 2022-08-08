package bestPractices.best_practice_1;

/** Use StringBuilder or StringBuffer for String Concatenation  :
 * The java best practice, in that case, would be using “StringBuilder” or “StringBuffer”.
 * These built-in functions modify a String without creating intermediate
 * String objects saving processing time and unnecessary memory usage.*/
public class BestPractice1 {

    public static void main(String[] args) {
        User user = new User();
        user.setName("Antoine");
        user.setAge("28");

        /** bad habit */
        String requestString = "INSERT INTO USERS (name,age)";
        requestString += " values ('"+ user.getName();
        requestString += "','"+ user.getAge();
        requestString += "')";
        System.out.println(requestString);

        /** best practice */
        StringBuilder requestStringBuilder = new StringBuilder("INSERT INTO USERS (name,age)");
        requestStringBuilder.append(" values ('")
                    .append(user.getName())
                    .append("','")
                    .append(user.getAge())
                    .append("')");
        System.out.println(requestStringBuilder);
    }
}



class User {
    private String name;
    private String age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}