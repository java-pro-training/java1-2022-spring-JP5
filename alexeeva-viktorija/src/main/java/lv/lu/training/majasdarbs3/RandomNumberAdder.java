package lv.lu.training.majasdarbs3;

import java.util.Random;

public class RandomNumberAdder {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();

        int random1 = randomNumberGenerator.nextInt(5);
        int random2 = randomNumberGenerator.nextInt(10);
        int random3 = randomNumberGenerator.nextInt(12);
        int result = random1 + random2 + random3;

        System.out.println("Results = " + result);



        // O.L. Mainīgo nosaukumus vēlams rakstīt ar mazo sākuma burtu - random1, random2, random3 un result
        // Tāpat arī visus mainīgos var saskaitīt vienā rindiņā "int result = random1 + random2 + random3"
    }
}
