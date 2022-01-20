package mot.super_;

class E {
    E(){
        System.out.println("E est crée");
    }
}

class F extends  E {
    F(){
        super();
        System.out.println("F est crée");
    }
}

public class SuperExemple2 {
    public static void main(String[] args) {
        F f = new F();
    }
}
