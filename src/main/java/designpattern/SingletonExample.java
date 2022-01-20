package designpattern;

public class SingletonExample {

    private static SingletonExample singletonExample = null;

    // private constructor
    private SingletonExample() {}

    public static SingletonExample getInstance(){
        //Si c'est la première instanaciation
        if(singletonExample == null){
            singletonExample = new SingletonExample();
        }
        //Si c'est la deuxieme instanaciation
        return singletonExample;
    }




    public static void main(String[] args) {
        SingletonExample se0 = SingletonExample.getInstance();
        SingletonExample se1 = SingletonExample.getInstance();

        /*
        * c'est le même hashcode cad que ça pointe vers le même espace mémoire
        * */
        System.out.println("Hashcode de l'objet se est : "+se0.hashCode());
        System.out.println("Hashcode de l'objet se est : "+se1.hashCode());

        /*
        * ça montre donc que c'est le même objet
        * */
        if (se0==se1) {
            System.out.println(
                    "two objects point to the same memory location and  to the same object");
        }

    }


}
