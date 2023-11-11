package general.overriding;

/**
 * If a Parent type reference refers to a Parent object, then Parent's  display() is called
 * If a Parent type reference refers to a Child object Child's display() is called. This is called RUN TIME POLYMORPHISM.
 * This method overrides display() of Parent
 */
public class Overriding extends Parent implements Interface {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();

        Parent child = new Overriding();
        child.display();

        Interface interfaceImpl = new Overriding();
        interfaceImpl.display();
    }

    @Override
    public void display() {
        System.out.println("Child's display()");
    }
}
