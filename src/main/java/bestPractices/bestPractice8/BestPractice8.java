package bestPractices.bestPractice8;

/** Avoid redundant initialisation
 * Although it is very common practice, it is not encouraged to initialize member
 * variables with the values: like 0, false and null.
 * These values are already the default initialization values of member variables in Java.
 * Therefore, a java best practice is to be aware of the default initialization
 * values of member variables and avoid initializing the variables explicitly.
 * */
public class BestPractice8 {
    /** Bad habit */
    private String name = null;
    private int age = 0;
    private boolean isGenuis = false;

    /** Good habit */
    private String surname;
    private int number;
    private boolean isWorking;
}