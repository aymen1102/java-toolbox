package general.variables.primitiveReference;

/**
 * -	Integer est une classe, alors que int est un type primitif
 * -	Avec la classe Integer, il existe plein de méthodes intéressantes
 * -	Int stocke les données alors qu’une référence stocke une adresse
 * -	Une variable de type primitif consomme moins de mémoire qu’une référence
 * -	Une variable de type primitif est plus rapide qu’une référence
 * -	Un type primitive ne peut pas être null contrairement à une référence
 */
public class PrimitiveReferenceExample {
    public static void main(String[] args) {
        int primitive = 10; // Single value container
        Integer reference = new Integer(54); // Boxed (Constructing the object)
        int primitiveFromReference = reference.intValue(); // Unboxing
        System.out.println(primitiveFromReference);
        /**
         * Variables in Java are classified into primitive and reference variables.
         * From the programmer's perspective, a primitive variable's information is
         * stored as the value of that variable, whereas a reference variable holds
         * a reference to information related to that variable.
         * reference variables are practically always objects in Java
         * primitives are data types, while references are pointers,
         * which do not hold their values but point to their values and are used on/with objects
         */
        int a = 10;     //one
        int b = a;
        a = 100;
        System.out.println("a = " + a + " | b = " + b);       //a = 100 | b = 10
        /**
         The object Person("Aymen") stored at a specific address in the memory
         The reference aymen is stored in another address in the memory */
        Person aymen = new Person("Aymen");

        /**
         The reference amine is stored in another address in the memory
         both references amine and aymen point to the same object */
        Person amine = aymen;
        System.out.println("Before changing Ahmed");
        System.out.println(aymen.name + " - " + amine.name);  // Aymen - Aymen
        System.out.println("After changing Ahmed");
        aymen.name = "Ahmed";
        System.out.println(aymen.name + " - " + amine.name);  // Ahmed - Ahmed
    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }
}
