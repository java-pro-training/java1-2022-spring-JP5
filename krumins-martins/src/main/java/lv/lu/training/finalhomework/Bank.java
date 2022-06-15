package lv.lu.training.finalhomework;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Bank {

    private final ArrayList<Account> accountList = new ArrayList<>();
    private final ArrayList<Transaction> transactionList = new ArrayList<>();

    public ArrayList<Transaction> getTransactionList() {
        return transactionList;
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    private Account getSpecificAccount(String accountNumber) {
        ArrayList<Account> accountList;
        accountList = getAccountList();
        for (Account account : accountList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public void blockAccount(String accountNumber) {

        Account account = getSpecificAccount(accountNumber);
        if (account != null) {
            account.setBlocked(true);
        }
    }

    public void unblockAccount(String accountNumber) {

        Account account = getSpecificAccount(accountNumber);
        if (account != null) {
            account.setBlocked(false);
        }
    }

    public void createAccount(String accountNumber, double balance, boolean blocked) {

        if (balance > 0) {
            if (accountNumber.matches("^[a-zA-Z0-9]{8}[0-9]{12}$")) {
                ArrayList<Account> accountList = this.getAccountList();
                Account newAccount = new Account(accountNumber, balance, blocked);
                accountList.add(newAccount);
            }
            else {
                System.out.printf("Could not create account %s%n", accountNumber);
                System.out.println("IBAN number is not valid!\n");
            }

        } else {
            System.out.printf("Could not create account %s%n", accountNumber);
            System.out.println("Opening balance for account should be larger than 0!\n");
        }
    }

    private String addSpaceIfNeeded(String value) {
        return (value != null && !value.equals("") ? " " : "");
    }

    public void createTransaction(String creditAccountNumber, String debitAccountNumber, double amount) {

        boolean error = false;
        String status = "";

        Account creditAccount = getSpecificAccount(creditAccountNumber);
        if (creditAccount == null) {
            status = "Credit account " + creditAccountNumber + " does not exist!";
            error = true;
        }

        Account debitAccount = getSpecificAccount(debitAccountNumber);
        if (debitAccount == null) {
            status = status + addSpaceIfNeeded(status) + "Debit account " + debitAccountNumber + " does not exist!";
            error = true;
        }

        if (creditAccount != null && amount > creditAccount.getBalance()) {
            status = status + addSpaceIfNeeded(status) + "Insufficient funds!";
            error = true;
        }

        if (debitAccount != null && debitAccount.isBlocked()) {
            status = status + addSpaceIfNeeded(status) + "Debit account is blocked!";
            error = true;
        }

        if (creditAccount != null && creditAccount.isBlocked()) {
            status = status + addSpaceIfNeeded(status) + "Credit account is blocked!";
            error = true;
        }

        if (!error) {
            creditAccount.setBalance(creditAccount.getBalance() - amount);
            debitAccount.setBalance(debitAccount.getBalance() + amount);
            status = "Success!";
        }

        ArrayList<Transaction> transactions = getTransactionList();
        Transaction creditTransaction = new Transaction(creditAccountNumber, debitAccountNumber, amount, new Date(), status);
        transactions.add(creditTransaction);

    }

    public void printAccounts() {

        ArrayList<Account> accountList;
        accountList = getAccountList();
        for (Account accountDetails : accountList) {
            System.out.printf("%-22s%-10.2f%s%n",
                    accountDetails.getAccountNumber(),
                    accountDetails.getBalance(),
                    accountDetails.isBlocked());
        }
    }

    public void printTransactions() {

        ArrayList<Transaction> transactions = getTransactionList();
        for (Transaction transactionDetails : transactions) {

            String pattern = "yyyy-MM-dd HH:mm:ss";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String date = simpleDateFormat.format(transactionDetails.getDateTime());

            System.out.printf("%-22s%-22s%-10.2f%-20s%s%n",
                    transactionDetails.getCreditAccountNumber(),
                    transactionDetails.getDebitAccountNumber(),
                    transactionDetails.getAmount(),
                    date,
                    transactionDetails.getStatus());
        }

    }

    public void printAccountTransactions(String accountNumber) {

        ArrayList<Transaction> transactions = getTransactionList();
        for (Transaction transaction : transactions) {
            if (transaction.getCreditAccountNumber().equals(accountNumber)) {
                String pattern = "yyyy-MM-dd HH:mm:ss";
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
                String date = simpleDateFormat.format(transaction.getDateTime());
                System.out.printf("%-22s%-22s%-10.2f%-20s%s%n",
                        transaction.getCreditAccountNumber(),
                        transaction.getDebitAccountNumber(),
                        transaction.getAmount(),
                        date,
                        transaction.getStatus());
            }
        }
    }
}
