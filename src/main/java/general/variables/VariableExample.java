package general.variables;

/**
 * -	Integer est une classe, alors que int est un type primitif
 * -	Avec la classe Integer, il existe plein de méthodes intéressantes
 * -	Int stocke les données alors qu’une référence stocke une adresse
 * -	Une variable de type primitif consomme moins de mémoire qu’une référence
 * -	Une variable de type primitif est plus rapide qu’une référence
 * -	Un type primitive ne peut pas être null contrairement à une référence
 */
public class VariableExample {

    public static void main(String[] args) {
        int x = 125563; //initialisation
        double y = 3.14;
        float f = 3.14f;
        long r = 1L;
        boolean z = true;
        char symblol = '@';

        System.out.println(x);
        System.out.println(y);
        System.out.println(f);
        System.out.println(r);
        System.out.println(symblol);



        Integer integer = 1;
        Double double_ = 4.0;
        Float float_ = 6f;
        Long long_ = 4L;
        Boolean boolean_ = true;
        Character char_ = 'g';
        String name = "Adrien";

        System.out.println(integer.max(5,4));  // 5
        // not a number
        System.out.println(double_.isNaN());  // false
        System.out.println(float_.min(4,9)); //4.0
    }

}
