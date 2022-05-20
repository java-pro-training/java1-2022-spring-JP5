package lv.lu.training.eightlecture;

public class BankAccount {
    private String accountNumber;
    private String pinCode;
    private double debitBilance;
    private double creditLimit;
    private double usedCredit;

    public BankAccount(String accountNumber, String pinCode, double debitBilance, double creditLimit, double usedCredit) {
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.debitBilance = debitBilance;
        this.creditLimit = creditLimit;
        this.usedCredit = usedCredit;
    }

    public void topUp(String enteredPinCode, double amount) {
        if (pinCode.equals(enteredPinCode)) {
            System.out.println("Pin code entered correct");
            if (usedCredit == 0) {
                this.debitBilance += amount;
            } else if (usedCredit < amount) {
                this.debitBilance += amount - usedCredit;
                this.usedCredit = 0;
            } else {
                this.usedCredit -= amount;
            }
        } else {
            System.out.println("WRONG PIN CODE!");
        }
    }

    public void withdraw(String enteredPinCode, double amount) {
        if (pinCode.equals(enteredPinCode)) {
            System.out.println("Pin code entered correct");
            double availableAmount = this.debitBilance + (this.creditLimit - this.usedCredit);
            if (availableAmount < amount) {
                System.out.println("You don't have enough debit and credit");
            } else if (amount < this.debitBilance) {
                this.debitBilance -= amount;
                System.out.println("Amount " + amount + " has been taken from debit");
            } else {
                this.usedCredit += amount - this.debitBilance;
                this.debitBilance = 0;
                System.out.println("Amount " + amount + " has been taken from debit and credit");
            }
        } else {
            System.out.println("WRONG PIN CODE!");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", debetBilance=" + debitBilance +
                ", creditLimit=" + creditLimit +
                ", usedCredit=" + usedCredit +
                '}';
    }
}
