package lv.lu.training;

import java.util.Random;

public class RandomNumberAdder {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        int randomNumber = randomNumberGenerator.nextInt(5);
        System.out.println(randomNumber);
        int randomNumber2 = randomNumberGenerator.nextInt(5);
        System.out.println(randomNumber2);
        int randomNumber3 = randomNumberGenerator.nextInt(5);
        System.out.println(randomNumber3);
        int result = randomNumber + randomNumber2 + randomNumber3;
        System.out.println("Result:" + result);
    }
}
