package java10.copyOf;

import java.util.Arrays;
/**La méthode copyOf sur les collections (List, Map) :
 permet de fixer une nouvelle longueur au tableau et copier un tableau dans un autre :
 méthodes copyOf(int[] original, int newLength).
 Ces méthodes retournent un nouveau tableau immodifiable, dans lequel les cases
 vides sont initialisées à null, ou à la valeur par défaut de chaque type primitif */
public class CopyOfExample {
    public static void main(String[] args) {
        // Exemple 1
        int[] T1 = { 2, 4, 5, 9, 5, 9 };
        int[] res = Arrays.copyOf(T1, 3); // [2, 4, 5]
        System.out.println(Arrays.toString(res));
        int[] res2 = Arrays.copyOf(T1, 10);
        System.out.println(Arrays.toString(res2)); // [2, 4, 5, 9, 5, 9, 0, 0, 0, 0]

        // Exemple 2
        int[] numbers = {1,2,3,4};
        System.out.println("Defaut Array :");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]); // 1 2 3 4
        }
        int[] copyOfNumbers = Arrays.copyOf(numbers,5);
        copyOfNumbers[4] = 5;
        System.out.println("After using copyOf :");
        for (int i = 0; i < copyOfNumbers.length; i++) {
            System.out.println(copyOfNumbers[i]); // 1 2 3 4 5
        }

        // Exemple 3
        char[] alphabet = {'A','B','C','D','E'};
        System.out.println(alphabet); // ABCDE

        char[] copyOfAlphabet = Arrays.copyOf(alphabet,8);
        System.out.println(Arrays.toString(copyOfAlphabet)); // [A, B, C, D, E,  ,  ,  ]

        copyOfAlphabet[5] = 'F';
        System.out.println(Arrays.toString(copyOfAlphabet)); // [A, B, C, D, E, F,  ,  ]

        alphabet[5] = 'F';
        System.out.println(Arrays.toString(alphabet)); // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    }
}
