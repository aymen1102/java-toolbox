package general.collections.set.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Créer un objet TreeSet
        TreeSet<String> tree = new TreeSet<String>();

        // Ajouter des éléments
        tree.add("Java");
        tree.add("Pascal");
        tree.add("PHP");
        tree.add("Python");

        // Afficher les éléments
        System.out.println(tree);

        System.out.println("Est-ce que Java existe-il? : "
                + tree.contains("Java"));

        // Supprimer des éléments
        tree.remove("Pascal");

        System.out.println("Après la suppression: " + tree);

        System.out.println("Itération sur les éléments:");
        Iterator<String> i = tree.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}