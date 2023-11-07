package general.classe.abstraction;

public class Dog extends AnimalPet{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("HAAAAB HAAAAAB");
    }

}
