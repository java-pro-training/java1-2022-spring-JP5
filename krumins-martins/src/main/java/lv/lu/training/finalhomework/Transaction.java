package lv.lu.training.finalhomework;

import java.util.Date;

public class Transaction {

    public Transaction(String creditAccountNumber, String debitAccountNumber, double amount, Date dateTime, String status) {
        this.creditAccountNumber = creditAccountNumber;
        this.debitAccountNumber = debitAccountNumber;
        this.amount = amount;
        this.dateTime = dateTime;
        this.status = status;
    }

    final private String creditAccountNumber;
    final private String debitAccountNumber;
    final private double amount;
    final private Date dateTime;
    final private String status;

    public String getCreditAccountNumber() {
        return creditAccountNumber;
    }

    public String getDebitAccountNumber() {
        return debitAccountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public String getStatus() {
        return status;
    }

}
