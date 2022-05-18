package lv.lu.training.homework5;

//CardUser klase tiek izmantota BankCard objekta veidosanai.

import java.time.LocalDate;

public class CardUser {
    public static void main(String[] args) {
        //BankCard objekta izveidosana:
        BankCard myCard = new BankCard("Citadele banka", "Visa", "Max Maxwell", "123456789", LocalDate.of(2024, 12, 31), "123");

        System.out.println("My card: " + myCard);
        //Tiek izdrukats klases nosaukums un hashcode parvests heksadecimalaja sistema: BankCard@30f39991
        //BankCard klase metode ir japarraksta toString, lai izdrukatu objekta CardUser laukus.

        //Naudas pievienosana kartei. Izsaukt kartes objektam metodi "addFunds".
        myCard.addFunds(100d);
        System.out.println("My card: " + myCard);

        //Naudas iznemsana no kartes.
        myCard.withdraw(20d);
        System.out.println("My card: " + myCard);
    }

}
