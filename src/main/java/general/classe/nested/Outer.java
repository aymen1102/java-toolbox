package general.classe.nested;
public class Outer {

    public String name = "Angélique";

    void showFromInner(){
        Inner inner = new Inner();
        inner.show();
    }

    class Inner{
        public void show(){
            System.out.println(name);
        }
    }
}
