package general.main;

public class MainExample {
    public static void main(String[] args) {
        System.out.println("String arguments passed while running this Java Program : ");
        for(String argument : args){
            System.out.println(argument);
        }
    }
}
