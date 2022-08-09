package general.keywords.this_;

public class ThisExamples {

    public static String nom = "AYMEN";

    public String setNom(String nom){
        return this.nom;
    }

    public static void main(String[] args) {
        ThisExamples thisExamples = new ThisExamples();
        System.out.println(thisExamples.setNom("BAROUDI")); //AYMEN
    }

}
