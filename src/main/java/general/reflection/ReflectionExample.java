package general.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Reflection in Java is a mechanism that allows a program to inspect or modify the
 * runtime behavior of applications running in the Java Virtual Machine (JVM). This feature is part of the Java API and provides the capability to:
 * Examine the structure of classes: Reflection can be used to get information about a class's methods, fields, constructors, and annotations.
 * Instantiate objects dynamically: It enables the creation of instances, invocation of methods, and access to fields of classes
 * at runtime without knowing their names at compile time.
 * Manipulate internal state of objects: With reflection, it's possible to read and modify the values of private fields and invoke private methods,
 * bypassing normal access control checks.
 */
public class ReflectionExample {
    public static void main(String[] args) throws IllegalAccessException {
        Person person = new Person(28, "Stella");
        Field[] declaredFields = person.getClass().getDeclaredFields();

        System.out.println("- Declared fields: ");
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName()); // age name
        }

        for (Field declaredField : declaredFields) {
            if (declaredField.getName().equals("name")) {
                declaredField.setAccessible(true);
                declaredField.set(person, "Leila");
            }
        }
        System.out.println("- Edited name: \n" + person.getName()); // Leila

        Method[] methods = person.getClass().getMethods();
        System.out.println("- Declared methods: ");
        for (Method method : methods) {
            System.out.println(method.getName()); // getName equals toString hashCode setName publicStaticMethod
        }
    }
}
