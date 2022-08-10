package general.modifiers.abstract_;

import static general.modifiers.abstract_.Bank.getAccountNumber;

public class Demo {
    public static void main(String[] args) {
        Bank bank1 = new Bnp();
        System.out.println(bank1.bankName);          // null
        System.out.println(bank1.customerNumbers);   // 0
        System.out.println(bank1.getInterestRate()); //4           // abstract
        System.out.println(bank1.getCity());         //Paris       // public
        // bank1.getBalance();                                     // private
        System.out.println(bank1.getTitle());         //Invest     // protected
        System.out.println(getAccountNumber());       //6565654    // static
    }
}
