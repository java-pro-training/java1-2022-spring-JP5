package lv.lu.training.MajasDarbs5;

import java.time.LocalDate;

public class BankCard {
    private String bankName;
    private String origin;
    private String holderName;
    private String cardNumber;
    private LocalDate expiryDate;
    private int cvv;
    private double balance;

    public BankCard(String bankName, String origin, String holderName, String cardNumber, LocalDate expiryDate, int cvv) {
        this.bankName = bankName;
        this.origin = origin;
        this.holderName = holderName;
        this.cardNumber = cardNumber;
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
        return  "Bank Name: " + bankName +
                ", Origin: " + origin +
                ", Holder Name: " + holderName +
                ", Card Number: " + cardNumber +
                ", Expiry Date: " + expiryDate +
                ", CVV: " + cvv +
                ", Balance: " + balance;
    }
}