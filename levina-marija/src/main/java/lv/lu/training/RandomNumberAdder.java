package lv.lu.training;

import java.util.Random;

public class RandomNumberAdder {
    public static void main(String[] args) {
       Random randomNumberGenerator = new Random();

       int random1 = randomNumberGenerator.nextInt();
       int random2 = randomNumberGenerator.nextInt();
       int random3 = randomNumberGenerator.nextInt();

        System.out.println(random1 + random2 + random3);
    }
}
