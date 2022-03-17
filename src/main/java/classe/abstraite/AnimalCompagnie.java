package classe.abstraite;

public abstract class AnimalCompagnie {

    private String nom;

    protected AnimalCompagnie(String nom) {
        this.nom = nom;
    }

    public abstract void parler();
}
