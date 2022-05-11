package lv.lu.training.MajasDarbs5;

import java.time.LocalDate;

public class CardUser {
    public static void main(String[] args) {
        BankCard myCard = new BankCard("Banka Citadele",
                "Visa",
                "Roberts Polis",
                "123456777",
                LocalDate.of(2024, 05, 14),
                345);
        System.out.println("My card - " + myCard);
        myCard.addFunds(100);
        System.out.println("My card - " + myCard);
        myCard.withdraw(20);
        System.out.println("My card - " + myCard);
    }
}