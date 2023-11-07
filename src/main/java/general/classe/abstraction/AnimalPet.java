package general.classe.abstraction;
/**
 An abstract class can extend another Java class and implement multiple Java interfaces.
 An abstract Java class can have private and protected class members.
 Constructors are allowed.
 Instance variables can be present in an abstract class.
 Static methods are allowed.
 Abstract methods are not implemented.
 It is possible to have a method body (non-abstract methods) in an abstract class.
 An abstract class can provide the implementation of the interface.
 */
public abstract class AnimalPet implements Animal{
    private String name;

    protected AnimalPet(String name) {
        this.name = name;
    }
    static void scream(){
        System.out.println("screaming");
    }
    public abstract void speak();
    public void cry(){
        System.out.println("crying");
    };
    @Override
    public void walk() {
        System.out.println("walking");
    }
}
