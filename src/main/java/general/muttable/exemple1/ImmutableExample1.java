package general.muttable.exemple1;

import java.util.ArrayList;
import java.util.List;

public class ImmutableExample1 {

    public static void main(String[] args) {

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
