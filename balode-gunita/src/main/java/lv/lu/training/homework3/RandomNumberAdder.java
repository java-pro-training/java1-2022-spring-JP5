package lv.lu.training.homework3;

import java.util.Random;

public class RandomNumberAdder {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();

        int randomNumber1 = randomNumberGenerator.nextInt();
        int randomNumber2 = randomNumberGenerator.nextInt();
        int randomNumber3 = randomNumberGenerator.nextInt();

        int sum = randomNumber1 + randomNumber2 + randomNumber3;

        System.out.println("Random Number: "+randomNumber1);
        System.out.println("Random Number: "+randomNumber2);
        System.out.println("Random Number: "+randomNumber3);
        System.out.println("Total Sum: "+sum);

    }
}
