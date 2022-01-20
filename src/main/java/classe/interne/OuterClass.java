package classe.interne;

public class OuterClass {
    public String name = "Aymen";

    public static void main(String[] args) {
        InnerClass ie = new OuterClass().new InnerClass();
        ie.show(); // Aymen
    }

    class InnerClass{
        public void show(){
            System.out.println(name);
        }
    }
}
