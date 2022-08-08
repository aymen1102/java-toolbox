package general.static_;

/**
 * Static methods
 * When a method is declared with the static keyword, it is known as the static method. The most common example of a static method is the main( ) method.
 * As discussed above, Any static member can be accessed before any objects of its class are created, and without reference to any object.
 * Methods declared as static have several restrictions:
 * They can only directly call other static methods.
 * They can only directly access static data.
 * They cannot refer to this or super in any way.
 * Below is the java program to demonstrate restrictions on static methods.
 * */
public class StaticMethodExample {
    static int a = 0;
    int b = 2;

    static int staticMethod(){
        a = 10;
        //b = 10; // compilation error
        return a;
    }

    public static void main(String[] args) {
        System.out.println(staticMethod());
    }
}
