package java10.copyOf;

import java.util.Arrays;
    /**La méthode copyOf sur les collections (List, Map) : permet de fixer une nouvelle longueur au tableau et copier un tableau dans un autre :
    méthodes copyOf(int[] original, int newLength). Ces méthodes retournent un nouveau tableau immodifiable, dans lequel les cases vides sont initialisées
     à null, ou à la valeur par défaut de chaque type primitif */
public class CopyOfExample0 {

    public static void main(String[] args) {
        char[] alphabet = {'A','B','C','D','E'};
        System.out.println(alphabet); // ABCDE

        char[] copyOfNumbers = Arrays.copyOf(alphabet,8);
        System.out.println(Arrays.toString(copyOfNumbers)); // [A, B, C, D, E,  ,  ,  ]

        copyOfNumbers[5] = 'F';
        System.out.println(Arrays.toString(copyOfNumbers)); // [A, B, C, D, E, F,  ,  ]

        alphabet[5] = 'F';
        System.out.println(Arrays.toString(alphabet)); // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    }
}
