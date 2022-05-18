package lv.lu.training;

import java.util.Scanner;

public class BankAccount {
    private String countNumber;
    private String pinCode;
    private double debetBalance;
    private double creditLimit;
    private double usedCredit;

    public BankAccount(String countNumber, String pinCode, double debetBalance, double creditLimit, double usedCredit) {
        this.countNumber = countNumber;
        this.pinCode = pinCode;
        this.debetBalance = debetBalance;
        this.creditLimit = creditLimit;
        this.usedCredit = usedCredit;
    }

public boolean topUp(double amount, String pinCode){
    double moneyForBalance = creditLimit - usedCredit;

    if (pinCode.equals(userPinCode)) {

        this.usedCredit += insertMoney;

    } else {
        System.out.println("Wrong pin code");
    }

}

public boolean withDraw(String pinCode, double amount){
    double availableAmount = debetBalance + (creditLimit - usedCredit);
    boolean isEnoughtMoney = availableAmount - amount > 0.001;

    if (pinCode.equals(userPincode)) {
        this.debetBalance -= amount;
    } else {
        System.out.print("Wrong pin code");

    }


}
    @Override
    public String toString() {
        return ", debetBalance=" + debetBalance +
                ", creditLimit=" + creditLimit +
                ", usedCredit=" + usedCredit;
    }


}
