package general.classe.abstract_;

public class Chien extends  AnimalCompagnie{

    public Chien(String nom) {
        super(nom);
    }

    @Override
    public void parler() {
        System.out.println("HAAAAB HAAAAAB");
    }

}
