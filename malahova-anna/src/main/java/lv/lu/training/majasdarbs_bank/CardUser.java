package lv.lu.training.majasdarbs_bank;

import java.time.LocalDate;

public class CardUser {
    public static void main(String[] args) {
        BankCard myCard = new BankCard(
                "Banka Citadele",
                "Visa",
                "Roberts Polis",
                "2345678345",
                LocalDate.of(2024, 12, 10),
                "134",0
        );

        myCard.addFunds(100d);
        System.out.println("Mana karte: " + myCard);

        myCard.withdraw(20d);
        System.out.println("Mana karte: " + myCard);

    }
}
