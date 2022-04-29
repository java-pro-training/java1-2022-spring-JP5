package lv.lu.training.fifthhomework;

public class BankAccount {

    final private String accountNumber;
    final private int pinCode;
    private double debit;
    final private double creditLimit;
    private double creditUsed;

    public BankAccount(String accountNumber, int pinCode, double debit, double creditLimit, double creditUsed) {
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.debit = debit;
        this.creditLimit = creditLimit;
        this.creditUsed = creditUsed;
    }

    public void withdraw(double value, int pinCode) {
        double credit;
        if (this.pinCode == pinCode) {
            if (this.debit >= value) {
                this.debit -= value;
            } else if (value <= (this.debit + (this.creditLimit - this.creditUsed))) {
                credit = Math.abs(value - this.debit);
                this.debit = 0;
                this.creditUsed += credit;
            } else {
                System.out.println("Not enough funds!");
            }

        } else {
            System.out.println("Wrong PIN code!");
        }
    }

    public void topUp(double value, int pinCode) {
        double creditAmountLeft;
        if (this.pinCode == pinCode) {
            if (this.creditUsed != 0) {
                creditAmountLeft = this.creditUsed - value;
                if (creditAmountLeft < 0) {
                    this.debit += Math.abs(creditAmountLeft);
                    this.creditUsed = 0;
                } else {
                    this.creditUsed = creditAmountLeft;
                }
            } else {
                this.debit += value;
            }
        } else {
            System.out.println("Wrong PIN code!");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", pinCode=" + pinCode +
                ", debit=" + debit +
                ", creditLimit=" + creditLimit +
                ", creditUsed=" + creditUsed +
                '}';
    }
}
