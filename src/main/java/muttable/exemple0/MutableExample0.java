package muttable.exemple0;

public class MutableExample0 {
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //   Qu'est-ce qu'un objet immuable ? Peut-on modifier un objet immuable ?                                                               //
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private String name;

    public MutableExample0(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        MutableExample0 me = new MutableExample0("Amine"); // me est un object mutable
        System.out.println(me.name); //Amine
        me.setName("Aymen");
        System.out.println(me.name); //Aymen
    }
}
