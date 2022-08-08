package general.classe.abstraite;


/**Une classe ne peut avoir qu'un seul parent abstrait*/
public class Chat extends AnimalCompagnie{

    public Chat(String nom) {
        super(nom);
    }

    @Override
    public void parler() {
        System.out.println("Miiiiiaouuuu");
    }


}
