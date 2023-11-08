package general.dependencyInjection.byConstructor;

interface Service {
    void serve();
}

/**
 * Injection by constructor: This is the most recommended method for dependency injection in Java, particularly with frameworks like Spring.
 * It guarantees object immutability, facilitates unit testing and ensures that the object always has all its dependencies before it is used.
 */
public class Application {
    public static void main(String[] args) {
        Service service = new ServiceImpl(); // Dependency
        Client client = new Client(service); // Injection
        client.doSomething();  // Service is serving.
    }
}

class ServiceImpl implements Service {
    public void serve() {
        System.out.println("Service is serving.");
    }
}

class Client {
    private final Service service;

    // Constructor-based DI
    public Client(Service service) {
        this.service = service;
    }

    public void doSomething() {
        service.serve();
    }
}

