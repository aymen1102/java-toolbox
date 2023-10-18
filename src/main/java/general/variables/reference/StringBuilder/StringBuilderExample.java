package general.variables.reference.StringBuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder request =
                new StringBuilder("INSERT INTO USERS (name,age)");
        request.append(" values ('")
                .append("Aymen")
                .append("','")
                .append(31)
                .append("')");
        System.out.println(request);
    }
}
