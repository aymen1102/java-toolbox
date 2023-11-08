package general.keywords.this_;

public class ThisExamples {

    public String nom = "AYMEN";

    public static void main(String[] args) {
        ThisExamples thisExamples = new ThisExamples();
        System.out.println(thisExamples.setNom("BAROUDI")); //AYMEN
        System.out.println();
    }

    public String setNom(String nom) {
        return this.nom;
    }

}
