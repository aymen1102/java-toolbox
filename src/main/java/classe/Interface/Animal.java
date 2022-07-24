package classe.Interface;

/**
 Une interface ne peut pas avoir de variables d'instance.
 Une interface ne peut pas avoir de constructeur.
 Les méthodes static sont autorisées à partir de java 8
 Une classe peut implémenter plusieurs interfaces
 Une interface ne peut pas fournir l'implémentation d'une classe abstraite.
 Une interface est uniquement autorisée à étendre une autre interface Java.
 Les membres d'une interface Java sont public par défaut */
public interface Animal {
    /**Une interface peut seulement avoir des méthodes abstraites. Dans Java 8 et les versions ultérieures,
     * il est devenu possible de définir des méthodes par défaut et de les implémenter directement dans une interface.
     * En outre, les interfaces peuvent avoir des méthodes static depuis Java 8.
     */
     void marcher();

     default void manger(){
         System.out.println("manger");
     };

     static void dormir(){
         System.out.println("dormir");
     };


}
