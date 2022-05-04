package lv.lu.training.majasdarbs5;

import java.util.Objects;

public class BankAccountOskaraVersija {

    private final String accountNumber;                          //Uzdevuma nosacījumos bija doti tikai tie 5 mainīgie
    private final String pinCode;
    private final double creditLimit;
    private double debitBalance;
    private double usedCredit;
//    private double amount;                                                        Šo dzēšam ārā, jo nav vajadzīgs



    public BankAccountOskaraVersija(String accountNumber, String pinCode, double debitBalance, double creditLimit, double usedCredit) {
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.debitBalance = debitBalance;
        this.creditLimit = creditLimit;
        this.usedCredit = usedCredit;
    }

//    public String pinCode1;                                                       Šos dzēšam ārā, jo nav vajadzīgi
//    public                                                                        Šos dzēšam ārā, jo nav vajadzīgi
//    public boolean isEnoughMoney = availableAmount - amount > 0.01;               Šos dzēšam ārā, jo nav vajadzīgi

    public void topUp(double amount, String pinCode1) {
        if (pinCode1.equals(pinCode)) {                                         //Pārbaudam pin kodu, vai pareizs
            if (usedCredit > 0.01 && usedCredit < amount) {                     //Pārbaudam vai kredīts ir un vai tas ir mazāks par iemaksāto summu
                debitBalance += amount - usedCredit;                            //Palielinam debitu ar starpību, kas paliks pāri apmaksājot kredītu
                usedCredit = 0;                                                 //Apmaksājam kredītu
            } else if(usedCredit > 0.01 && usedCredit >= amount) {              //Pārbaudam vai kredīts ir un vai tas ir lielāks/vienāds par iemaksāto summu
                usedCredit -= amount;                                           //Apmaksājam kredītu, cik varam. Debitā neko neiemaksājam, jo nav vairs naudas
            } else debitBalance += amount;                                      //Šajā gadījuma mēs saprotam, ka nav kredīts un pa taisno maksājam debitā
        } else System.out.println("PinCode is wrong");
    }

    public void withDraw(double amount, String pinCode1) {
        double availableAmount = debitBalance + (creditLimit - usedCredit);         //Iegūstam cik daudz kopā šis cilvēks var izņemt
        if (pinCode1.equals(pinCode)) {                                             //Pārbaudam pin kodu, vai pareizs
            if (debitBalance >= amount) {                                           //Apskatāmies vai debitā ir pietiekami līdzekļu
                this.debitBalance -= amount;                                        //Ja debitā ir, tad ņemam no debita
            } else if(availableAmount >= amount ) {                                 // Ja debitā nav, bet kopā ir iespējams tik izņemts, tad
                usedCredit += amount - debitBalance;                                // Palielinam aizņēmuma summu ar starpbību no tā cik gribam un cik ir jau debitā
                debitBalance = 0;                                                   // Uzstādam debit bilanci uz 0
            } else System.out.println("Not enough money");
        } else System.out.println("PinCode is wrong");
    }

    //Metodes toString, equals un hashCode ir pārrakstītas atbilstoši esošajiem mainīgajiem
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", creditLimit=" + creditLimit +
                ", debitBalance=" + debitBalance +
                ", usedCredit=" + usedCredit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccountOskaraVersija that)) return false;
        return Double.compare(that.creditLimit, creditLimit) == 0 && Double.compare(that.debitBalance, debitBalance) == 0 && Double.compare(that.usedCredit, usedCredit) == 0 && Objects.equals(accountNumber, that.accountNumber) && Objects.equals(pinCode, that.pinCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, pinCode, creditLimit, debitBalance, usedCredit);
    }
}

