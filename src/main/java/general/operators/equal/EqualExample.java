package general.operators.equal;

public class EqualExample {
    public static void main(String[] args) {
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //   Différence entre == et equal()                                                                                                      //
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        String s1 = "chien";
        String s2 = "chien";
        //Comparaison des références
        System.out.println(s1 == s2); // true
        //Content comparaison
        System.out.println(s1.equals(s2)); //true
        //integer type
        System.out.println(10 == 10); //true
        //char type
        System.out.println('a' == 'a'); //true
    }
}
