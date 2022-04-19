package lv.lu.training;

import java.util.Random;

public class RandomNumberAdder {

    public static void main(String[] args) {

        Random randomNumberGenerator = new Random();

        int randomNumber1 = randomNumberGenerator.nextInt();
        int randomNumber2 = randomNumberGenerator.nextInt();
        int randomNumber3 = randomNumberGenerator.nextInt();
        int result4 = randomNumber1 + randomNumber2 +randomNumber3;

        System.out.println(result4);
    }
}
