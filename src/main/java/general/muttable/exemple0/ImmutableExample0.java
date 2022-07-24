package general.muttable.exemple0;

public final class ImmutableExample0 { //final

    private final String name;

    public ImmutableExample0(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        ImmutableExample0 ie = new ImmutableExample0("Amine");
        System.out.println(ie.getName()); //Amine
    }

}
