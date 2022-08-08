package general.classe.inner;

/**	inner class : ou classe interne, est une classe définie (déclarée) à l’intérieur d’une classe. Elle est indépendante et peut avoir ses propres méthodes et attributs
 *  subclass : sous classe, est une classe fille d’une classe mère, et donc elle peut réutiliser voire réécrire les méthodes de sa classe mère.
 * */
public class MainClass {

    public static void main(String[] args) {
        // First call
        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
        innerClass.show(); // Emir

        // Second call
        OuterClass outerClass = new OuterClass();
        outerClass.showFromInnerClass(); // Emir
    }

}
