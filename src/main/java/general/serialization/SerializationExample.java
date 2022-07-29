package general.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
 /**Sérializer un objet consiste à le convertir en un tableau d’octets  que l’on peut ensuite écrire dans un fichier  et envoyer par la suite.
 * Il suffit de passer tout objet qui implémente l’interface serializable à une instance de ObjectOutputStream pour sérialiser l’objet.
 * Cela consiste à stocker un objet sous une certaine forme en dehors de la JVM.
 * En général, la sérialisation est utilisée lorsque nous voulons que l'objet existe au-delà de la durée de vie de la machine virtuelle Java.
 * On peut donc stocker un objet el recréer ensuite même lors d’une autre exécution
 * Les objets sérialisés peuvent être stockés dans des fichiers ou des bases de données
 * Pour résumer, c’est le fait de prendre un objet de la mémoire et le convertir en tableau de byte (octets) et l’envoyer à une application sur une autre machine.
 * La condition pour qu’un objet soit serializable cette classe doit implémenter l’interface serializable
 */
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
