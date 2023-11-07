package general.collections.map.hashTable;

import java.util.Hashtable;

/**
 Hashtable is a legacy data structure in Java that implements the Map interface.
 It stores key-value pairs in a hash table, where keys are hashed to indices in an array.
 The most critical thing to remember about Hashtable is that it is synchronized,
 which means it is thread-safe; all of its public methods are synchronized,
 but this leads to a performance cost when not used in multithreaded contexts.
 Unlike newer Map implementations such as HashMap, Hashtable does not allow null keys or values.
 Due to its legacy status, it is generally recommended to use ConcurrentHashMap
 for a thread-safe Map and HashMap for non-thread-safe situations where synchronization
 is handled externally or not required.
 */
public class HashTableExample {
    public static void main(String[] args) {
        Hashtable hashTable = new Hashtable();
        hashTable.put(1, "Papa");
        hashTable.put(2, "Maman");
        hashTable.put(3, "Oncle");
        hashTable.put(4, "Tante");

        System.out.println(hashTable.get(2)); // Maman
        System.out.println(hashTable.values()); // [Papa, Maman, Oncle, Tante]
        System.out.println(hashTable.containsKey(7)); // false
        System.out.println(hashTable.entrySet()); // [1=Papa, 2=Maman, 3=Oncle, 4=Tante]
        System.out.println(hashTable.containsValue("Frere")); // false
        System.out.println(hashTable.keys());
        System.out.println(hashTable.elements());

        for (Object h : hashTable.entrySet()) {
            System.out.println(h);  //
        }
    }
}
