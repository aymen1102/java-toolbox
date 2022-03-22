package general.muttable.exemple1;

import java.util.ArrayList;
import java.util.List;

public class ImmutableExample1 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
        names.add("Aymen");
        names.add("Hatem");
        names.add("Fakhri");

        List<String> copyOfNames = List.copyOf(names);
        doChange(copyOfNames);
        System.out.println(copyOfNames); // java.lang.UnsupportedOperationException at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
    }

    private static void doChange(List<String> names) {
        names.add("J'ajoute un nom !");
    }

}
