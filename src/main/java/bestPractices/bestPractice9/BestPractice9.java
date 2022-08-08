package bestPractices.bestPractice9;

import java.util.ArrayList;
import java.util.List;

/** Prefer interface references :
 * references to the objects should be as generic as possible
 * When declaring collection objects, references to the objects should be as generic as possible.
 * This is to maximize the flexibility and protect the code from possible changes in the underlying collection implementations class.
 * That means we should declare collection objects using their interfaces List, Set, Map, Queue and Deque.
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
