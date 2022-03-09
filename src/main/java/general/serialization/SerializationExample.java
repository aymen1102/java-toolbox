package general.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {

    public static void main(String[] args) {
        try {
            Employee employee1 = new Employee("Laurent","Blanc", 46,"Single");
            Employee employee2 = new Employee("Maria","Sharapova", 26,"Married");

            FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/output.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(employee1);
            objectOutputStream.writeObject(employee2);

            objectOutputStream.flush();
            objectOutputStream.close();
            System.out.println("Object has been serialized");
        } catch (Exception exception){
            System.out.println(exception);
        }
    }
}
