package general.modifiers.final_.methods;

/**
 * final on a method: This prevents any subclass from redefining the method.
 * This is useful for ensuring that the behavior of a method is not modified in derived classes.
 */
public class Mercedes extends Car {

    public String getSimpleMethod() {
        return "Edited simple method";
    }

    /**
     * 'getFinalMethod()' cannot override 'getFinalMethod()' in 'general.modifiers.final_.methods.Car';
     * overridden method is final
     * public String getFinalMethod(){
     *   return "Edited final method";
     * }
     */
}