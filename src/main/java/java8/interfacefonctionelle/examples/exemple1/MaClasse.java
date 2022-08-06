package java8.interfacefonctionelle.examples.exemple1;

public class MaClasse {
    public static void main(String[] args) {
        InterfaceFunc obj = () -> System.out.println("Implémenation de ma méthode");
        obj.maFonction();
    }
}
