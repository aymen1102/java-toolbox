package general.hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableExample {
    Integer a = 0;
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(1,"Papa");
        ht.put(2,"Maman");
        ht.put(3,"Oncle");
        ht.put(4,"Tante");

        System.out.println(ht.get(2)); // Maman
        System.out.println(ht.values()); // [Papa, Maman, Oncle, Tante]
        System.out.println(ht.containsKey(7)); // false
        System.out.println(ht.entrySet()); // [1=Papa, 2=Maman, 3=Oncle, 4=Tante]
        System.out.println(ht.containsValue("Frere")); // false

        for (Object h:ht.entrySet()){
            System.out.println(h);
        }
    }
}
