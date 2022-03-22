package general.muttable.exemple1;

import java.util.ArrayList;
import java.util.List;

public class MutableExample1 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
        names.add("Aymen");
        names.add("Hatem");
        names.add("Fakhri");

        doChange(names);
        System.out.println(names); // [Aymen, Hatem, Fakhri, J'ajoute un nom !]
    }

    private static void doChange(List<String> names) {
        names.add("J'ajoute un nom !");
    }

}
