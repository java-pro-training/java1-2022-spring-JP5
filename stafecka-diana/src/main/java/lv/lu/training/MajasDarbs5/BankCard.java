package lv.lu.training.MajasDarbs5;

import java.time.LocalDate;

public class BankCard {


    public String bankName;
    public String origin;
    public String holderName;
    public String number;
    public LocalDate expiryDate;
    public String cvv;
    public int balance;


    public BankCard (String bankName, String origin,String holderName,String number,LocalDate expiryDate,String cvv) {
        this.bankName = bankName;
        this.origin = origin;
        this.holderName = holderName;
        this.number = number;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.balance = 0;
    }

    public void withdraw(double value) {
        this.balance -= value;
    }

    public void addFunds(double value) {
        this.balance += value;
    }

    public String getBankName() {
    return bankName;
    }

    public String getHolderName() {
    return holderName;
    }

    public String getOrigin() {
    return origin;
    }

    public String getNumber() {
    return number;
    }

    public LocalDate getExpiryDate() {
    return expiryDate;
    }

    public String getCvv() {
      return cvv;

   }
}

