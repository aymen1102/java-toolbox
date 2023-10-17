package designPatterns.structural.adapter;

// Interface existante
interface OldSystem {
    void oldMethod();
}

class OldSystemImpl implements OldSystem {
    public void oldMethod() {
        System.out.println("Old system method");
    }
}

// Interface cible
interface NewSystem {
    void newMethod();
}

// Adapter
class Adapter implements NewSystem {
    private OldSystem oldSystem;

    public Adapter(OldSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    public void newMethod() {
        oldSystem.oldMethod();
    }
}

// Client
public class Main {
    public static void main(String[] args) {
        OldSystem oldSystem = new OldSystemImpl();
        NewSystem newSystem = new Adapter(oldSystem);

        newSystem.newMethod(); // Output: "Old system method"
    }
}
