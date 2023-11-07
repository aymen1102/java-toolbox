package general.classe.enumeration;

public enum FruitsEnum {
    ORANGE(3),
    CHERRY(2),
    BANANA(6),
    STRAWBERRY(8);

    final int howMuchDelicious;

    FruitsEnum(int howMuchDelicious) {
        this.howMuchDelicious = howMuchDelicious;
    }
}
