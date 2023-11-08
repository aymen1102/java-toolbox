package general.generics;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        // Create a Pair with String and Integer
        Pair<String, Integer> grade = new Pair<>("Math", 90);
        System.out.println(grade.getKey() + ": " + grade.getValue());

        // Create a Pair with Integer and String
        Pair<Integer, String> reversedPair = new Pair<>(1, "One");
        System.out.println(reversedPair.getKey() + " = " + reversedPair.getValue());

        // Create a Pair with two different object types
        Pair<String, Boolean> isAdult = new Pair<>("John", true);
        System.out.println(isAdult.getKey() + " is adult? " + isAdult.getValue());
    }
}

