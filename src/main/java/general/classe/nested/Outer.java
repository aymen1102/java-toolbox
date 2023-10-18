package general.classe.nested;
public class Outer {
    private String name = "Angélique";

    class Inner{
        public void show(){
            System.out.println(name);
        }
    }

    void showFromInner(){
        Inner inner = new Inner();
        inner.show();
    }
}
