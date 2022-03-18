package general.serialization;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeserializationExample {
    public static void main(String[] args) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/main/resources/output.txt"));

            Employee employee1 = (Employee) objectInputStream.readObject();
            Employee employee2 = (Employee) objectInputStream.readObject();

            System.out.println(employee1);
            System.out.println(employee2);
            objectInputStream.close();
            System.out.println("Object has been deserialized");

        } catch (Exception exception){
            System.out.println(exception);
        }
    }
}
