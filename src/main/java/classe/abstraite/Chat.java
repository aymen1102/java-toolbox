package classe.abstraite;


public class Chat extends AnimalCompagnie{

    public Chat(String nom) {
        super(nom);
    }

    @Override
    public void parler() {
        System.out.println("Miiiiiaouuuu");
    }
}
