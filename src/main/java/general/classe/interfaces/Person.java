package general.classe.interfaces;

public class Person implements Animal,Human{

    public static void main(String[] args) {
        Person person = new Person();
        person.marcher();
        person.manger();
        person.parler();
        Animal.dormir();  // dormir() is a static method
    }
    @Override
    public void marcher() {
        System.out.println("marcher");
    }
    @Override
    public void parler() {
        System.out.println("Une personne parle");
    }
}
