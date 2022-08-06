package general.overriding;

public class OverridingExample extends Parent{
    public static void main(String[] args) {
        // If a Parent type reference refers
        // to a Parent object, then Parent's
        // show is called
        Parent parent = new Parent();
        parent.display();

        // If a Parent type reference refers
        // to a Child object Child's diplay()
        // is called. This is called RUN TIME
        // POLYMORPHISM.
        Parent parent1 = new OverridingExample();
        parent1.display();
    }

    // This method overrides diplay() of Parent
    @Override
    void display(){
        System.out.println("Child's diplay()");
    }
}
