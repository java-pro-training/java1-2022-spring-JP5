package lv.lu.training.homework5;

import java.time.LocalDate;
import java.util.Objects;

public class BankCard {

    //Pievienot LocalDate biblioteku

    //Mainigie, kuri iekapsule datu klase. Private - dati nav tiesi pieejami.
    private String bankName;
    private String origin;
    private String holderName;
    private String number;
    private LocalDate expiryDate;
    private String cvv;
    private double balance;

    //Konstruktors ar 6 mainigajiem - parametriem
    public BankCard(String bankName, String origin, String holderName, String number, LocalDate expiryDate, String cvv) {
        this.bankName = bankName;
        this.origin = origin;
        this.holderName = holderName;
        this.number = number;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    //Metodes izveidosana naudas iznemsanai
    public void withdraw(double value) {
        this.balance -= value;
    }

    //Metodes izveidosana naudas pievienosanai
    public void addFunds(double value) {
        this.balance += value;
    }

    //Lai izdrukatu objekta CardUser laukus, nepieciesams parrakstit metodi "to String" (Generate -> toString):
    @Override
    public String toString() {
        return "BankCard{" +
                "bankName='" + bankName + '\'' +
                ", origin='" + origin + '\'' +
                ", holderName='" + holderName + '\'' +
                ", number='" + number + '\'' +
                ", expiryDate=" + expiryDate +
                ", cvv='" + cvv + '\'' +
                ", balance=" + balance +
                '}';
    }
}