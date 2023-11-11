package general.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Object serialization is the process of converting an object into a byte stream in order to store
 * it in a data medium (such as a file or database) or send it over a network.
 * This byte stream can then be deserialized, i.e. converted back into an object in memory.
 * For a Java object to be serialized, it must implement the Serializable interface.
 * The main advantage of serialization is that it preserves the state of an object.
 * For example, a serialized object can be saved to disk and retrieved later, even after the JVM has been shut down,
 * retaining all its original properties and state. Serialization is also useful when communicating between
 * two applications or machines, enabling objects to be sent and received over a network.
 */
public class SerializationExample {

    public static void main(String[] args) {
        try {
            Employee employee1 = new Employee("Laurent", "Blanc", 46, "Single");
            Employee employee2 = new Employee("Maria", "Sharapova", 26, "Married");

            FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/output.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(employee1);
            objectOutputStream.writeObject(employee2);

            objectOutputStream.flush();
            objectOutputStream.close();
            System.out.println("Object has been serialized");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
