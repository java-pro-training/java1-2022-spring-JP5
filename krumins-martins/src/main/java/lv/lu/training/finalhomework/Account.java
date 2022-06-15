package lv.lu.training.finalhomework;

public class Account {

    private final String accountNumber;
    private double balance;
    private boolean blocked;

    public Account(String accountNumber, double balance, boolean blocked) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.blocked = blocked;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
}
