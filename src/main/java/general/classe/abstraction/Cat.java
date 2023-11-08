package general.classe.abstraction;


/**
 * A class can have only one abstract parent.
 */
public class Cat extends AnimalPet {
    public Cat(String nom) {
        super(nom);
    }

    @Override
    public void speak() {
        System.out.println("Miiiiiaouuuu");
    }
}
