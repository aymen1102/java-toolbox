package general.modifiers.abstract_;

import static general.modifiers.abstract_.Bank.getAccountNumber;

public class Demo {
    public static void main(String[] args) {
        Bank bank = new Bnp();
        System.out.println(bank.bankName);          // null
        System.out.println(bank.customerNumbers);   // 0
        System.out.println(bank.getInterestRate()); // 4          // abstract
        System.out.println(bank.getCity());         //Paris       // public
        System.out.println(bank.getTitle());         //Invest     // protected
        System.out.println(getAccountNumber());       //6565654    // static
        // bank1.getBalance();                                     // private
    }
}
