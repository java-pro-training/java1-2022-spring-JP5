package lv.lu.training;

import java.util.Random;

public class RandomNumberAdder {
    public static void main(String[] args) {

        Random randomNumberGenerator = new Random();

        int nextInt2 = randomNumberGenerator.nextInt();
        int nextInt1 = randomNumberGenerator.nextInt();
        int nextInt = randomNumberGenerator.nextInt();
        int sum = nextInt + nextInt1 + nextInt2;
        System.out.println("Random Number 1: " + nextInt);
        System.out.println("Random Number 2: " + nextInt1);
        System.out.println("Random Number 3: " + nextInt2);
        System.out.println("Sum: " + sum);
    }
}
