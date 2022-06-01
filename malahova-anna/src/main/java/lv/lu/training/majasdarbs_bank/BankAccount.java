package lv.lu.training.majasdarbs_bank;

public class BankAccount {

    //define mainigos
    private String accountNumber;
    private String pinCode;
    private double debetBalance;
    private double creditLimit;
    private double usedCredit;
    private double amount;

    //konstruktors
    public BankAccount(String accountNumber, String pinCode, double debetBalance, double creditLimit, double usedCredit) {
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.debetBalance = debetBalance;
        this.creditLimit = creditLimit;
        this.usedCredit = usedCredit;
    }

    //naudas iznemsanas metode
    public void withdraw(double amount, String pinCode) {

        double availableAmount = debetBalance + (creditLimit - usedCredit);
        double isEnoughFunds = availableAmount - amount;

        if (pinCode == this.pinCode) {
            System.out.println("PIN is correct!");
            if (isEnoughFunds > 0.00) {
                System.out.println("Funds are available in the account!");
                if (debetBalance >= amount) {
                    debetBalance -= amount;
                } else if (availableAmount >= amount) {
                    usedCredit += amount - debetBalance;
                    debetBalance = 0;
                } else  {
                    System.out.println("Not enough money!");
                }
            } else {
                System.out.println("Funds are not available in the account!");
            }
        } else {
            System.out.println("PIN is incorrect!");
        }
    }

    //GB: Naudas iemaksas metode
    public void topup(double amount, String pinCode) {
        if (pinCode == this.pinCode) {
            System.out.println("PIN is correct!");
            if (usedCredit > 0.00 && amount >= usedCredit) {
                debetBalance += amount - usedCredit;
                usedCredit = 0;
            } else if (usedCredit > 0.00 && amount <= usedCredit) {
                usedCredit -= amount;
            } else {
                debetBalance += amount;
            }
        } else {
            System.out.println("PIN is incorrect! Try again!");
        }
    }

    //GB: Lai izdrukatu objekta MoneyTransaction laukus
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", debitBalance=" + debetBalance +
                ", creditLimit=" + creditLimit +
                ", usedCreditLimit=" + usedCredit +
                ", amount=" + amount +
                '}';
    }

}
