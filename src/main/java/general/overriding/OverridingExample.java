package general.overriding;

public class OverridingExample extends Parent{
    public static void main(String[] args) {
        /** If a Parent type reference refers to a Parent object,
         * then Parent's  display() is called */
        Parent parent = new Parent();
        parent.display();

        /**If a Parent type reference refers to a Child object Child's display()
           is called. This is called RUN TIME POLYMORPHISM. */
        Parent parent1 = new OverridingExample();
        parent1.display();
    }

    // This method overrides display() of Parent
    @Override
    void display(){
        System.out.println("Child's display()");
    }
}
