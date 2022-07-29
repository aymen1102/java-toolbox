package map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashmapExamples {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Papa");
        map.put(2,"Maman");
        map.put(3,"Oncle");
        map.put(4,"Tante");

        System.out.println(map.get(2)); // Maman
        System.out.println(map.values()); // [Papa, Maman, Oncle, Tante]
        System.out.println(map.containsKey(7)); // false
        System.out.println(map.entrySet()); // [1=Papa, 2=Maman, 3=Oncle, 4=Tante]
        System.out.println(map.containsValue("Frere")); // false
        System.out.println(map.keySet());  // [1, 2, 3, 4]
        System.out.println(map.size());    // 4

        for (Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()); // 1 . . .
            System.out.println(m.getValue()); // Maman . . .
        }
    }
}
