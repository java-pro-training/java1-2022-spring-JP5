package lv.lu.training.MajasDarbs5;

import java.util.Objects;

public class BankAccount {
    private String accountNumber;
    private String pinCode;
    private String pinCode1;
    private int debitLimit;
    private int creditLimit;
    private int usedCreditLimit;

    public BankAccount(String accountNumber, String pinCode, int debitLimit, int creditLimit, int usedCreditLimit) {
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.debitLimit = debitLimit;
        this.creditLimit = creditLimit;
        this.usedCreditLimit = usedCreditLimit;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPinCode1() {
        return pinCode1;
    }

    public int getDebitLimit() {
        return debitLimit;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int getUsedCreditLimit() {
        return usedCreditLimit;
    }

    public String getPinCode() {
        return pinCode;
    }

    @Override
    public String toString() {
        return "Balance for " +
                "account number -> " + accountNumber +
                ", Debit Limit: " + debitLimit +
                ", Credit Limit: " + creditLimit +
                ", Used Credit Limit " + usedCreditLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Objects.equals(pinCode, that.pinCode);
    }

    public void topUp(int amount, String pinCode1) {
        if (pinCode != pinCode1) {
            System.out.println("PIN code not valid");
        } else if (pinCode.equals(pinCode)) {
            if (amount < usedCreditLimit) {
                this.usedCreditLimit = usedCreditLimit - amount;
                System.out.println(toString());
            } else if (amount == usedCreditLimit) {
                this.usedCreditLimit = 0;
                System.out.println(toString());
            } else if (amount > usedCreditLimit) {
                this.debitLimit = debitLimit + (amount - usedCreditLimit);
                this.usedCreditLimit = 0;
                System.out.println(toString());
            }
        }
    }
    public void withDraw(int amount1, String pinCode1) {
        if (pinCode != pinCode1) {
            System.out.println("PIN code not valid");
        } else if (pinCode.equals(pinCode)) {
            if (amount1 <= debitLimit) {
                this.debitLimit = debitLimit - amount1;
                System.out.println(toString());
            } else if (amount1 == debitLimit + (creditLimit - usedCreditLimit)){
                this.usedCreditLimit = creditLimit;
                this.debitLimit = 0;
                System.out.println(toString());
            } else if(amount1 < debitLimit + (creditLimit - usedCreditLimit)) {
                this.debitLimit = 0;
                this.usedCreditLimit = (creditLimit - usedCreditLimit) - (amount1 - debitLimit);
                System.out.println(toString());
            } else if (amount1 > debitLimit + (creditLimit - usedCreditLimit)) {
                System.out.println("Not enough debit and credit");
                System.out.println(toString());
            }
        }
    }
}