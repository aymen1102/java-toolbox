package general.exceptions.throws_;

public class ThrowsExample {

    public static void main(String[] args) throws Exception {
            throwsMethod();
    }

    static void throwsMethod() throws Exception{
        String name = null;
        name.toString();
    }
}
