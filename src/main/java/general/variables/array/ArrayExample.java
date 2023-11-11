package general.variables.array;

public class ArrayExample {
    static String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    static int[][] myNumbers = {{12, 21, 35, 43}, {95, 56, 17}};

    public static void main(String[] args) {
        System.out.println("- Using for i loop :");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println("- Using enhanced loop :");
        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println("- Get data from multi-dimensional array: ");
        System.out.println(myNumbers[1][2]); // Outputs 17

        System.out.println("- Get all data from multi-dimensional array: ");
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
            }
        }
    }
}
