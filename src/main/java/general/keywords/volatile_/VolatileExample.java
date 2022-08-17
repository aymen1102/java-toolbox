package general.keywords.volatile_;

/**
 * Le mot clé volatile s'utilise sur la déclaration d'une variable.
 * Le mot clé volatile n'est pas utilisable sur une méthode ou une classe.
 * Cela permet de garantir que la lecture de la donnée par un thread retournera
 * la valeur la plus récente en mémoire.
 */
public class VolatileExample {
    private volatile int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void increaseCounter(){
        counter++;
    }
}
