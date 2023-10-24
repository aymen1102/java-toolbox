package general.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) throws IllegalAccessException {
        Person person = new Person(28, "Stella");
        Field[] declaredFields = person.getClass().getDeclaredFields();

        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName()); // age name
        }

        for (Field declaredField : declaredFields) {
            if (declaredField.getName().equals("name")) {
                declaredField.setAccessible(true);
                declaredField.set(person, "Leila");
            }
        }
        System.out.println(person.getName()); // Leila

        Method[] methods = person.getClass().getMethods();
        for (Method method : methods) {
            System.out.println(method.getName()); // getName equals toString hashCode setName publicStaticMethod
        }
    }
}
