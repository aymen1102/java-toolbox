package general.classe.nested;

/**	inner class : ou classe interne, est une classe définie (déclarée) à l’intérieur d’une classe.
 *  Elle est indépendante et peut avoir ses propres méthodes et attributs
 *  subclass : sous classe, est une classe fille d’une classe mère, et donc
 *  elle peut réutiliser voire réécrire les méthodes de sa classe mère.
 * */
public class Main {

    public static void main(String[] args) {
        // First call
        Outer.Inner inner = new Outer().new Inner();
        inner.show(); // Angélique

        // Second call
        Outer outer = new Outer();
        outer.showFromInner(); // Angélique
    }

}
