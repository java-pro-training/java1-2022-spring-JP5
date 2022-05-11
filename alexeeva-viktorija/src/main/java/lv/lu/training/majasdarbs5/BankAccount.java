package lv.lu.training.majasdarbs5;

import java.util.Objects;

public class BankAccount {

    private String accountNumber;
    private String pinCode;
    private double debitBalance;
    private double creditLimit;
    private double usedCredit;


    public BankAccount(String accountNumber, String pinCode, double debitBalance, double creditLimit, double usedCredit) {
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.debitBalance = debitBalance;
        this.creditLimit = creditLimit;
        this.usedCredit = usedCredit;

    }

    public void topUp(double amount, String pinCode1) {
        if (pinCode1.equals(pinCode)) {
            if (usedCredit > 0.01 && usedCredit < amount) {
                debitBalance += amount - usedCredit;
                usedCredit = 0;
            } else if (usedCredit > 0.01 && usedCredit >= amount) {
                usedCredit -= amount;
            } else debitBalance += amount;
        } else System.out.println("PinCode is wrong");
    }

    public void withDraw(double amount, String pinCode1) {
        double availableAmount = debitBalance + (creditLimit - usedCredit);
        if (pinCode1.equals(pinCode)) {
            if (debitBalance >= amount) {
                debitBalance -= amount;
            } else if (availableAmount >= amount) {
                usedCredit += amount - debitBalance;
                debitBalance = 0;
            } else System.out.println("Not enough money");
        } else System.out.println("PinCode is wrong");
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", debitBalance=" + debitBalance +
                ", creditLimit=" + creditLimit +
                ", usedCredit=" + usedCredit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccount)) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(that.debitBalance, debitBalance) == 0 && Double.compare(that.creditLimit, creditLimit) == 0 && Double.compare(that.usedCredit, usedCredit) == 0 && Objects.equals(accountNumber, that.accountNumber) && Objects.equals(pinCode, that.pinCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, pinCode, debitBalance, creditLimit, usedCredit);
    }
}
