package collections.set.hashSet;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        Set<String> numbers = new HashSet();
        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");
        numbers.add("One");
        numbers.add("Two");

        System.out.println(numbers); // [One, Two, Three]

        Iterator<String> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // One Two Three
        }

        System.out.println("numbers contains the number three : " + numbers.contains("Three")); // true
        System.out.println("numbers size is : " + numbers.size()); // 3

        numbers.remove("Three");
        System.out.println(numbers); // [One, Two]

        numbers.clear();
        System.out.println(numbers.isEmpty()); // true

        Set<Integer> numbersSet = new HashSet();
        numbersSet.add(1);
        numbersSet.add(4);
        numbersSet.add(3);
        numbersSet.add(2);

        int n = numbersSet.size();
        List<Integer> aList = new ArrayList<Integer>();
        for (int x : numbersSet)
            aList.add(x);

        Collections.sort(aList);
        System.out.println(aList);
        
    }
}
