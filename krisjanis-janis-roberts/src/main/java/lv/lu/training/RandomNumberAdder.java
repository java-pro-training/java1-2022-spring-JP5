package lv.lu.training;

import java.util.Random;

public class RandomNumberAdder {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();

        int random1 = randomNumberGenerator.nextInt(6);
        int random2 = randomNumberGenerator.nextInt(12);
        int random3 = randomNumberGenerator.nextInt(18);
        int result = random1 + random2 + random3;

        System.out.println("Results = " + result);
    }
}
