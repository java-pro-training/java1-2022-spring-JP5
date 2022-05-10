package lv.lu.training.md3;

import java.util.Random;

public class RandomNumberAdder {
    public static void main(String[] args) {

        Random randomNumberGenerator = new Random();

        randomNumberGenerator.nextInt(1, 100);

        System.out.println("Random numbers:" + randomNumberGenerator.nextInt(1, 100));
        System.out.println("Random numbers:" + randomNumberGenerator.nextInt(1, 100));
        System.out.println("Random numbers:" + randomNumberGenerator.nextInt(1, 100));

    }
}
