package bestPractices.best_practice_9;

import java.util.ArrayList;
import java.util.List;

/** Prefer interface references :
 * references to the objects should be as generic as possible
 */
public class BestPractice9 {

    /** bad habit */
    public ArrayList<String> getArrayList() {
        return new ArrayList<String>();
    }

    /** good habit */
    public List<String> getList(){
        return new ArrayList<String>();
    }
}
