package general.classe.enumeration;

public class EnumExample {
    public static void main(String[] args) {
        DaysEnum monday = DaysEnum.Monday;
        System.out.println(monday);
        for (DaysEnum day : DaysEnum.values()) {
            System.out.println(day);
        }
        System.out.println(FruitsEnum.CHERRY);
        System.out.println(FruitsEnum.CHERRY.howMuchDelicious);
    }
}
