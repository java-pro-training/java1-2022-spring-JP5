package lv.lu.training.MajasDarbs5;

public class BankAccount {
    public int accountNumber;
    public String pinCode;
    public int debitBalance;
    public int creditLimit;
    public int usedLimit;
    public double withdrawAmount;

    public BankAccount(int accountNumber, String pinCode, int debitBalance, int creditLimit, int usedLimit) {

        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.debitBalance = debitBalance;
        this.creditLimit = creditLimit;
        this.usedLimit = usedLimit;
    }

    public void withdraw(double withdrawAmount, String pinCode) {
        double brivaisLimits = (debitBalance + creditLimit - usedLimit); // pārbaudi vai man vispār pietiek nauda, lai izņemtu pilnu apjomu
        double bankBalance = brivaisLimits - withdrawAmount;
        // double newLimit = debitBalance - withdrawAmount;
        if (pinCode == this.pinCode) {
            System.out.println("PIN is correct!");
            if (bankBalance > 0.00) {
                System.out.println("Nauda pieliek, turpinam");
                if (debitBalance >= withdrawAmount) {
                    debitBalance -= withdrawAmount;
                } else if (brivaisLimits >= withdrawAmount) {
                    usedLimit += withdrawAmount - debitBalance;
                    debitBalance = 0;
                } else {
                    //System.out.println("PIN is incorrect! Try again!");
                   System.out.println("nepietiek naudas, lai iznemtu vajadzigo");
                }
            } else {
                System.out.println("nepietiek naudas");
            }
        } else {
            //System.out.println("Not enough funds to withdraw the amount!");
            System.out.println("PIN is incorrect! ");
        }
    }
    public void topUp(double topUpAmount, String pinCode) {

        if (pinCode == this.pinCode) {
            System.out.println("PIN is correct!");
            // top up vispirms jāaizpild iztērētais kredītlimits un tikai tad var palielināt debeta atlikumu. vai man jāpārliecinās, ka top up piepildīs kredītlimitu?

            if (usedLimit > 0) {
                debitBalance +=  topUpAmount - usedLimit;
                usedLimit = 0;
            } else if (usedLimit >= 0 && topUpAmount < usedLimit) {
                usedLimit -= topUpAmount;
            } else {
                debitBalance += topUpAmount;
            }

        }
    }




    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", debitBalance=" + debitBalance +
                ", creditLimit=" + creditLimit +
                ", usedCreditLimit=" + usedLimit +
                ", withdrawAmount=" + withdrawAmount +
                '}';
    }
}

