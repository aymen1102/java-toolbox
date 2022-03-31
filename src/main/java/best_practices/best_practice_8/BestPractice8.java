package best_practices.best_practice_8;

/** Avoid redundant initialisation */
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
