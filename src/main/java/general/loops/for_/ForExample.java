package general.loops.for_;

public class ForExample {
    public static void main(String[] args) {
        System.out.println("* simple for loop :");
        for (int i = 0; i < 5; i++) {
            System.out.print(i);  // 0 1 2 3 4
        }

        System.out.println("\n* enhanced for loop : ");
        String[] cars = {"Volvo ", "BMW ", "Ford ", "Mazda "};
        for (String i : cars) {
            System.out.print(i); // Volvo BMW Ford Mazda
        }

        System.out.println("\n* simple for loop with break : ");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.print(" "+i);
        }

        System.out.println("\n* simple for loop with continue : ");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.print(" "+i);
        }
    }
}
