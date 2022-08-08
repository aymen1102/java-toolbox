package general.classe.interface_.single;

public class Elephant implements Animal{

    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        elephant.marcher();
        elephant.manger();

        // dormir();  // dormir() is a static method
    }

    @Override
    public void marcher() {
        System.out.println("marcher");
    }
}
