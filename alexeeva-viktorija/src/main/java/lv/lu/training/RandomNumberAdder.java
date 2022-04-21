package lv.lu.training;

import java.util.Random;

public class RandomNumberAdder {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();

        int Random1 = randomNumberGenerator.nextInt(5);
        int Random2 = randomNumberGenerator.nextInt(10);
        int Random3 = randomNumberGenerator.nextInt(15);
        int Result = Random1;
        Result += Random2;
        Result += Random3;

        System.out.println("Results = " + Result);



        // O.L. Mainīgo nosaukumus vēlams rakstīt ar mazo sākuma burtu - random1, random2, random3 un result
        // Tāpat arī visus mainīgos var saskaitīt vienā rindiņā "int result = random1 + random2 + random3"
    }
}
