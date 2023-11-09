package general.keywords.super_;

class C {
    void show() {
        System.out.println("C'est la classe C");
    }
}

class D extends C {
    void show() {
        System.out.println("C'est la classe D");
    }

    void dispay() {
        show();
        super.show();
    }
}

public class Method {
    public static void main(String[] args) {
        D d = new D();
        d.dispay();
    }
}
