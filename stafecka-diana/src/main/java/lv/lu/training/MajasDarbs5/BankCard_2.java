package lv.lu.training.MajasDarbs5;

import java.time.LocalDate;

public class BankCard_2 {
    public String bankName;
    public String origin;
    public String holderName;
    public String number;
    public LocalDate expiryDate;
    public String cvv;
    public int balance;


    public BankCard_2 (String bankName, String origin,String holderName,String number,LocalDate expiryDate,String cvv) {
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
    @Override
    public String toString() {
        return "BankCard_2{" +
                "bankName='" + bankName + "' " +
                ", origin='" + origin + "' " +
                ", holderName='" + holderName + "' " +
                ", number='" + number + "' " +
                ", expiryDate=" + expiryDate +
                ", cvv='" + cvv + "' " +
                ", balance=" + balance +
                '}';
    }

}
