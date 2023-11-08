package algorithmics.bankAccount;

import java.math.BigDecimal;
import java.util.List;

public class Account {

    private BigDecimal balance;
    private List<Transaction> transactionsList;

    public static BigDecimal decreaseBalance(Account account, Transaction transaction) {
        account.setBalance(account.getBalance().subtract(transaction.getTransactionAmount()));
        return account.getBalance();
    }

    public BigDecimal getNewBalance(Account account, Transaction transaction) {
        if (transaction.isDeposit())
            return increaseBalance(account, transaction);
        else if (transaction.isWithdraw())
            return decreaseBalance(account, transaction);
        else
            return null;
    }

    public BigDecimal increaseBalance(Account account, Transaction transaction) {
        account.setBalance(account.getBalance().add(transaction.getTransactionAmount()));
        return account.getBalance();
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactionsList() {
        return transactionsList;
    }

    public void setTransactionsList(List<Transaction> transactionsList) {
        this.transactionsList = transactionsList;
    }

}
