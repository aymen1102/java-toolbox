package general.immuable;

import java.util.ArrayList;
import java.util.List;

/**In the string constant pool, the Hello remains unchanged, and a new string object is created with
 * Hello World. It shows that the strings are immutable.
 * The reference variable points to the Hello not to the HelloWorld. */
public class ImmuableExample {

    public static void main(String[] args) {
        String hello = "Hello ";
        String world = "World !";
        /**Java Strings are Immutable
        //Here, we are using the concat() method to add another string World to the previous string.
        //It looks like we are able to change the value of the previous string. However, this is not true.*/
        System.out.println("Java Strings are Immutable: " + hello.concat(world)); //Java Strings are Immutable: Hello world !


        List<String> names = new ArrayList<String>();
        names.add("Aymen");
        names.add("Hatem");
        names.add("Fakhri");
        /**La méthode copyOf sur les collections (List, Map) : permet de fixer une nouvelle longueur au tableau et copier un tableau dans un autre :
         méthodes copyOf(int[] original, int newLength). Ces méthodes retournent un nouveau tableau immodifiable, dans lequel les cases vides sont initialisées
         à null, ou à la valeur par défaut de chaque type primitif */
        List<String> copyOfNames = List.copyOf(names);
        addName(copyOfNames);
        System.out.println(copyOfNames); // java.lang.UnsupportedOperationException at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)

    }


    private static void addName(List<String> names) {
        names.add("J'ajoute un nom !");
    }


}
