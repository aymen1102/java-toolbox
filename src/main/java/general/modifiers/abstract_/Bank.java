package general.modifiers.abstract_;

/**
 * Data abstraction is the process of hiding certain details and showing only essential information to the user.
 * Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).
 * The abstract keyword is a non-access modifier, used for classes and methods:
 * Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
 * Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
 */
abstract class Bank {

    public String bankName;
    protected int customerNumbers;

    abstract int getInterestRate();

    public String getCity(){
        return "Paris";
    }

    private String getBalance(){
        return "99965469464";
    }

    protected String getTitle(){
        return "Invest";
    }

    static int getAccountNumber(){
        return 6565654;
    }
}