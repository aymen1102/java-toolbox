package general.operators.logical;

public class LogicalExample {
    public static void main(String[] args) {
        boolean isAdult = false;
        boolean isStudent = true;
        System.out.println(isStudent||isAdult); //true
        System.out.println(isStudent&&isAdult); //false
        System.out.println(!isStudent&&isAdult); //false
        System.out.println((isStudent||isAdult)&&(isStudent&&isAdult)); //false
        System.out.println((isStudent||isAdult)&&!(isStudent&&isAdult)); //true
        System.out.println((isStudent||isAdult)||(isStudent&&isAdult)); //true
        System.out.println((isStudent||isAdult)||!(isStudent&&isAdult)); //true
    }
}
