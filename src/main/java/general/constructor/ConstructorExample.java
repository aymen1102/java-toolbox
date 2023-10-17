package general.constructor;

/** constructor in Java is a special method that is used to initialize objects.
 * The constructor is called when an object of a class is created.
 * It can be used to set initial values for object attributes
 */
public class ConstructorExample {
    private String title;

    // All arguments constructor
    public ConstructorExample(String title){
        this.title = title;
    }

    // No arguments constructor
    public ConstructorExample(){

    }

    public static void main(String[] args) {
        ConstructorExample constructorExample = new ConstructorExample();
        System.out.println(constructorExample.title);  //null

        ConstructorExample constructorExample1 = new ConstructorExample("All arguments constructor");
        System.out.println(constructorExample1.title);  // All argument constructor

        System.out.println(constructorExample.hashCode());
        System.out.println(constructorExample1.hashCode());
    }


}
