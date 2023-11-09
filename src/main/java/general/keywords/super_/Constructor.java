package general.keywords.super_;

class E {
    E() {
        System.out.println("E created");
    }
}

class F extends E {
    F() {
        super();
        System.out.println("F created");
    }
}

public class Constructor {
    public static void main(String[] args) {
        F f = new F();
    }
}
