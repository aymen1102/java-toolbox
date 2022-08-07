package general.super_;

class C{
    void show(){
        System.out.println("C'est la classe C");
    }
}

class D extends C{
    void show(){
        System.out.println("C'est la classe D");
    }
    void dispay(){
        show(); // C'est la classe D
        super.show(); // C'est la classe C
    }
}

public class SuperExemple1 {
    public static void main(String[] args) {
        D d = new D();
        d.dispay();
    }
}
