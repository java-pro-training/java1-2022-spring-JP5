package lv.lu.training;

import java.util.Random;

public class RandomNumberAdder {

    public static void main(String[] args) {

        int firstRandomNumber;
        int secondRandomNumber;
        int thirdRandomNumber;
        Random randomNumberGenerator = new Random();
        firstRandomNumber = randomNumberGenerator.nextInt();
        secondRandomNumber = randomNumberGenerator.nextInt();
        thirdRandomNumber =  randomNumberGenerator.nextInt();
        System.out.println(firstRandomNumber + secondRandomNumber + thirdRandomNumber);

        // O.L. Darbi ļoti labi uzrakstīti. Vienīgi mazs komentārs par šo - nosacījums bija, ka visu
        // trīs mainīgo vērtības tiek piešķirtas no jauna izveidotam lokālajam mainīgajam,
        // tad šeit būtu jāizveido jauns mainīgais, piemēram int result
    }
}
