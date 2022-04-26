package lv.lu.training;

import java.util.Random;

public class RandomNumberAdder {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        randomNumberGenerator.nextInt();
        int Random1 = randomNumberGenerator.nextInt();
        int Random2 = randomNumberGenerator.nextInt();
        int Random3 = randomNumberGenerator.nextInt();
        int Result = Random1;
        Result = Result + Random2;
        Result += Random3;
        System.out.println(Random1);
        System.out.println(Random2);
        System.out.println(Random3);
        System.out.println(Result);

        //O.L. - Viss labi. Mazs komentārs, šajā gadījumā mums nav tik būtiska tā saskaitīšana un rindiņas
        //12 - 14 ir iespējams apraksīt vienā rindiņā - saskaitot visu reizē "int Result = Random1 + Random2 + Random3"
        //Kā arī mainīgos vēlams rakstīt ar mazo sākuma burtu - random1, random2, random3
    }
}
