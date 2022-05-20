package lv.lu.training.homework5;

public class BankAccount {

    private String accountNumber;
    private String pinCode;
    private double debitBalance;
    private double creditLimit;
    private double usedCreditLimit;
    private double amount;

    public BankAccount(String accountNumber, String pinCode, double debitBalance, double creditLimit, double usedCreditLimit) {
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.debitBalance = debitBalance;
        this.creditLimit = creditLimit;
        this.usedCreditLimit = usedCreditLimit;
    }

    public void withdraw (double amount, String pinCode) {
        double availableAmount = debitBalance + (creditLimit - usedCreditLimit);
        double isEnoughFunds = availableAmount - amount;
        if (pinCode == this.pinCode) {
            System.out.println("PIN is correct!");
            if (isEnoughFunds > 0.00) {
                System.out.println("Funds are available in the account!");
                if (debitBalance >= amount) {
                    debitBalance -= amount;
                } else if (availableAmount >= amount) {
                    usedCreditLimit += amount - debitBalance;
                    debitBalance = 0;
                } else  {
                    System.out.println("Not enough funds to withdraw the amount!");
                }
            } else {
                System.out.println("Funds are not available in the account!");
            }
        } else {
            System.out.println("PIN is incorrect! Try again!");
        }
    }

    public void topup (double amount, String pinCode) {
        if (pinCode == this.pinCode) {
            System.out.println("PIN is correct!");
            if (usedCreditLimit > 0.00 && amount >= usedCreditLimit) {
                debitBalance += amount - usedCreditLimit;
                usedCreditLimit = 0;
            } else if (usedCreditLimit > 0.00 && amount <= usedCreditLimit) {
                usedCreditLimit -= amount;
            } else {
                debitBalance += amount;
            }
        } else {
            System.out.println("PIN is incorrect! Try again!");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", debitBalance=" + debitBalance +
                ", creditLimit=" + creditLimit +
                ", usedCreditLimit=" + usedCreditLimit +
                ", amount=" + amount +
                '}';
    }
}

