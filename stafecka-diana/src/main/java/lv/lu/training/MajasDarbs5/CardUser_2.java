package lv.lu.training.MajasDarbs5;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class CardUser_2 {
    public static void main(String[] args) {

        BankCard_2 myCard = new BankCard_2("Citadele Banka", "Visa", "Roberts Polis", "2345678345", LocalDate.of(2024, 12, 10), "134");

        System.out.println("Mana karte: " + myCard);

        myCard.addFunds(100d);

        System.out.println("Mana karte " + myCard);

        myCard.withdraw(20d);
        System.out.println("Mana karte " + myCard);


    }

}