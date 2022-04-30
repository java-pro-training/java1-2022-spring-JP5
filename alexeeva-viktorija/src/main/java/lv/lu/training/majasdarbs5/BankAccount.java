package lv.lu.training.majasdarbs5;

import java.util.Objects;

public class BankAccount {

    private String accountNumber;
    private String pinCode;
    private double debitBalance;
    private double creditLimit;
    private double usedCredit;
    private double amount;

    public BankAccount(String accountNumber, String pinCode, double debitBalance, double creditLimit, double usedCredit) {
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.debitBalance = debitBalance;
        this.creditLimit = creditLimit;
        this.usedCredit = usedCredit;

    }

    public void topUp(double amount) {
        this.debitBalance += amount;
    }

    public void withDraw(double amount) {
        this.debitBalance -= amount;
    }

    public double availableAmount = debitBalance + (creditLimit - usedCredit);
    public boolean isEnoughMoney = availableAmount - amount > 0.01;


    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", debitBalance=" + debitBalance +
                ", creditLimit=" + creditLimit +
                ", usedCredit=" + usedCredit +
                ", balance=" + balance +
                ", amount=" + amount +
                ", availableAmount=" + availableAmount +
                ", isEnoughMoney=" + isEnoughMoney +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccount)) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(that.debitBalance, debitBalance) == 0 && Double.compare(that.creditLimit, creditLimit) == 0 && Double.compare(that.usedCredit, usedCredit) == 0 && Double.compare(that.amount, amount) == 0 && Double.compare(that.availableAmount, availableAmount) == 0 && isEnoughMoney == that.isEnoughMoney && accountNumber.equals(that.accountNumber) && pinCode.equals(that.pinCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, pinCode, debitBalance, creditLimit, usedCredit, amount, availableAmount, isEnoughMoney);
    }
}

