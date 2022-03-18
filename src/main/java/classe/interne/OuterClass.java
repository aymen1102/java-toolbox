package classe.interne;

public class OuterClass {

    public String name = "Emir";

    void showFromInnerClass(){
        InnerClass innerClass = new InnerClass();
        innerClass.show();
    }

    class InnerClass{
        public void show(){
            System.out.println(name);
        }
    }
}
