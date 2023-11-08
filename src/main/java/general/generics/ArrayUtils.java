package general.generics;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {

    public static void main(String[] args) {
        // Convert an Integer array to a list
        Integer[] integerArray = {1, 2, 3, 4, 5};
        List<Integer> integerList = ArrayUtils.arrayToList(integerArray);
        System.out.println("Integer List: " + integerList);

        // Convert a String array to a list
        String[] stringArray = {"hello", "world", "generic", "method"};
        List<String> stringList = ArrayUtils.arrayToList(stringArray);
        System.out.println("String List: " + stringList);

        // Convert a Double array to a list
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        List<Double> doubleList = ArrayUtils.arrayToList(doubleArray);
        System.out.println("Double List: " + doubleList);
    }

    // Generic method to convert an array to a list
    public static <T> List<T> arrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }

}