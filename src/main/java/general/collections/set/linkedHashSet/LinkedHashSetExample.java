package general.collections.set.linkedHashSet;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        //Fetching key
        System.out.println("Keys: "+map.keySet());
        //Fetching value
        System.out.println("Values: "+map.values());
        //Fetching key-value pair
        System.out.println("Key-Value pairs: "+map.entrySet());


    }
}
