package general.map.hashtable;

import java.util.Hashtable;

/**
 * HashTable est une table de hachage appartient au package util.list et implémente l'interface Map.
 * Elle est représentée par un tableau de liste.
 * Chaque liste est identifiée par sa clé donc elle permet de créer une collection d'objets associés à des noms.
 * Elle est similaire à HashMap mais elle est synchronisée.
 */
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

        for (Object h : ht.entrySet()){
            System.out.println(h);
        }
    }
}
