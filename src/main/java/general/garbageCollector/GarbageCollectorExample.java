package general.garbageCollector;

public class GarbageCollectorExample {

    public static void main(String[] args) {
        GarbageCollectorExample gc1 = new GarbageCollectorExample();
        GarbageCollectorExample gc2 = new GarbageCollectorExample();

        /**
         * How can an object be unreferenced?
         * There are many ways:
         * By nulling the reference example : gc1=null;
         * By assigning a reference to another example : gc1=gc2;
         * By anonymous object example : new GarbageCollectorExample();
         */
        gc1=null;
        gc2=null;

        System.gc();    // object is garbage collected
                        // object is garbage collected
    }

    /**
     * he finalize() method is invoked each time before the object is garbage collected. This method can be used to perform cleanup processing.
     * This method is defined in Object class
     */
    public void finalize(){
        System.out.println("object is garbage collected");
    }
}
