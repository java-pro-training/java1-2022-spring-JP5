package lv.lu.training;

import java.util.Random;

public class RandomNumberAdder {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();

        int Random1 = randomNumberGenerator.nextInt(5);
        int Random2 = randomNumberGenerator.nextInt(7);
        int Random3 = randomNumberGenerator.nextInt(8);
        int Result = Random1;
        Result = Result + Random2;
        Result += Random3;

        System.out.println("Results = " + Result);




    }
}
