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

    }
}
