package general.modifiers.abstract_;

abstract class Bank {

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
