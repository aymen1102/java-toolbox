package general.classe.abstract_;
/**
Une classe abstraite peut étendre une autre classe Java et implémenter plusieurs interfaces Java.
 */
public abstract class AnimalCompagnie implements Animal{

    /**Une classe Java abstraite peut avoir des membres de classe private et protected*/
    private String nom;


    /**Les constructeurs sont autorisés*/
    /**Des variables d'instance peuvent se trouver dans une classe abstraite*/
    protected AnimalCompagnie(String nom) {
        this.nom = nom;
    }

    /** Les méthodes static sont autorisées*/
    static void crier(){
        System.out.println("Crier");
    }

    /** Les méthodes abstraites ne sont pas implémentés*/
    public abstract void parler();

    /**Il est possible d'avoir un corps de méthode (méthodes non abstraites)
     * dans une classe abstraite*/
    public void pleurer(){
        System.out.println("pleurer");
    };

    /**Une classe abstraite peut fournir l'implémentation de l'interface.*/
    @Override
    public void marcher() {

    }
}
