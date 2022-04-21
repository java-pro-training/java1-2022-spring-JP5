package lv.lu.training;

import java.util.Random;

public class RandomNumberAdder {

    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        int randomNumber1 = randomNumberGenerator.nextInt();
        int randomNumber2 = randomNumberGenerator.nextInt();
        int randomNumber3 = randomNumberGenerator.nextInt();

        System.out.println("randomNumber1 " + randomNumber1);
        System.out.println("randomNumber2 " + randomNumber2);
        System.out.println("randomNumber3 " + randomNumber3);

        // O.L. Darbs nepilnīgi izpildīts, lūgums apskatīt uzdevuma nosacījumus līdz galam
        int summa = ( randomNumber1 + randomNumber2 + randomNumber3);
        System.out.println("Summa = " + summa);
  }

 }