package general.classe.anonymous;

public class AnonymousClassExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.run();
        Animal dog = new Animal() {
            @Override
            public void run() {
                System.out.println("Dog is running");
            }
        };
        dog.run();
    }
}
