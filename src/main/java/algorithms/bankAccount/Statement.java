package algorithms.bankAccount;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Statement {

    private static final String STATEMENT_HEADER = "Date        | Credit   | Debit    |  Balance";
    private static final String DATE_FORMAT = "dd/MM/yyyy";
    private static final String SEPARATOR = "  |          |  ";

    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(BigDecimal.ZERO);
        List<Transaction> transactionsList = getDataMock();
        account.setTransactionsList(transactionsList);
        System.out.println(STATEMENT_HEADER);
        printStatement(account);
    }

    public static void printStatement(Account account) {
        account.getTransactionsList().stream()
                .map(transaction -> {
                    if (transaction.isDeposit()) {
                        return printDepositStatement(account, transaction);
                    }
                    if (transaction.isWithdraw()) {
                        return printWithdrawStatement(account, transaction);
                    }
                    return null;
                }).forEach(System.out::println);
    }

    public static StringBuilder printDepositStatement(Account account, Transaction transaction) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);
        StringBuilder line = new StringBuilder();
        line.append(simpleDateFormat.format(transaction.getTransactionDate()))
                .append("  |     ")
                .append(transaction.getTransactionAmount())
                .append(SEPARATOR)
                .append(account.getNewBalance(account, transaction));
        return line;
    }

    public static StringBuilder printWithdrawStatement(Account account, Transaction transaction) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);
        StringBuilder line = new StringBuilder();
        line.append(simpleDateFormat.format(transaction.getTransactionDate()))
                .append(SEPARATOR)
                .append(transaction.getTransactionAmount())
                .append("     |  ")
                .append(account.getNewBalance(account, transaction));
        return line;
    }

    public static Date changeDateFormat(String oldDate) {
        Date newDate = null;
        try {
            newDate = new SimpleDateFormat(DATE_FORMAT).parse(oldDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return newDate;
    }

    public static List<Transaction> getDataMock() {
        List<Transaction> transactionsList = new ArrayList<>();

        Transaction transaction1 = new Transaction();
        transaction1.setTransactionDate(changeDateFormat("04/07/2022"));
        transaction1.setTransactionAmount(BigDecimal.valueOf(500));
        transaction1.setDeposit(true);

        Transaction transaction2 = new Transaction();
        transaction2.setTransactionDate(changeDateFormat("29/06/2022"));
        transaction2.setTransactionAmount(BigDecimal.valueOf(400));
        transaction2.setWithdraw(true);

        Transaction transaction3 = new Transaction();
        transaction3.setTransactionDate(changeDateFormat("26/06/2022"));
        transaction3.setTransactionAmount(BigDecimal.valueOf(200));
        transaction3.setDeposit(true);

        Transaction transaction4 = new Transaction();
        transaction4.setTransactionDate(changeDateFormat("21/06/2022"));
        transaction4.setTransactionAmount(BigDecimal.valueOf(100));
        transaction4.setWithdraw(true);

        transactionsList.add(transaction1);
        transactionsList.add(transaction2);
        transactionsList.add(transaction3);
        transactionsList.add(transaction4);

        return transactionsList;
    }
}
