package general.overriding;

public interface Interface {
    default void display() {
        System.out.println("Here, i implemented default method");
    }
}
