package bestPractices.best_practice_11;

/** Proper handling of Null Pointer Exceptions
 * Null Pointer Exceptions are very common in Java.
 * This exception occurs in a result of an attempt to call a method on a Null Object Reference.
 * Null pointer exceptions are inevitable but for its better handling, there are some java coding best practices to follow.
 * First, it is important to check Nulls prior execution so that they can be eliminated and alter your code to handle it well.
 These can be:
 - Invoking a method from a null object.
 - Accessing or modifying a null object’s field.
 - Taking the length of null, as if it were an array.
 - Accessing or modifying the slots of null object, as if it were an array.
 - Throwing null, as if it were a Throwable value.
 - When you try to synchronize over a null object.
 */
public class BestPractice11 {

    public static void main(String[] args) {
        /** Case 1 : String comparison with literals */
        try {
            String studentName = null;
            if(studentName.equals("Jack"))
                System.out.println("this is the same student");
            else
                System.out.println("This student is different");
        } catch (Exception e){
            System.out.println("Null pointer exception !!");  //Null pointer exception !!
        }

        try {
            String studentName = null;
            if ("Jack".equals(studentName))
                System.out.println("this is the same student");
            else
                System.out.println("This student is different");  //This student is different
        } catch (Exception e){
            System.out.println("Null pointer exception !!");
        }



        /** Case 3 : Use of Ternary Operator */
        // Initializing String variable with null value
        String str = null;
        String message = (str == null) ? "" :
                str.substring(0,5);
        System.out.println(message);   // ""

        // Initializing String variable with null value
        str = "This is good";
        message = (str == null) ? "" : str.substring(0,7);
        System.out.println(message);  // This is



        /** Case 2 : Keeping a Check on the arguments of a method*/
        String studentName = null;
        if(studentName == null)
            throw new IllegalArgumentException("The argument cannot be null");
        else
            System.out.println(studentName);
    }
}