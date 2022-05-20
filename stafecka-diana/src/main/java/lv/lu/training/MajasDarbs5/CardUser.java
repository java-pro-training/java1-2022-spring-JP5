package lv.lu.training.MajasDarbs5;

import java.time.LocalDate;

public class CardUser {
    public static void main(String[] args) {

        BankCard myCard = new BankCard("Citadele Banka", "Visa", "Roberts Polis", "2345678345", LocalDate.of(2024, 12, 10), "134");

        System.out.println("Manas kartes izdevejbanka: " + myCard.getBankName());
        System.out.println("manas kartes veids ir: " + myCard.getOrigin());
       System.out.println("Kartes turetajs: " + myCard.getHolderName());
        System.out.println("Kartes numurs ir " + myCard.getNumber());
        System.out.println("Kartes deriguma termins (parasti gan ir bez menesa dienas :) " + myCard.getExpiryDate());
        System.out.println("Kartes CVV kods ir (katra zagla sapnis sanemt sos datus :) " + myCard.getCvv());

    }
}
// Bāc, man vajag iemācīties izlasīt uzdevumu līdz galam. ieraudzīju, ka neizdrukājas mycard detaļas un sataisīju get metodes. ....



