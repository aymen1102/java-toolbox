package general.reflection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private int age;
    private String name;

    private void privateMethod(){
        System.out.println("private method");
    }

    public static void publicStaticMethod() {
        System.out.println("public static method");
    }
}
