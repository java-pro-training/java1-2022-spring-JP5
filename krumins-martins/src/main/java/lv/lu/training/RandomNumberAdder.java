package lv.lu.training;

import java.util.Random;

public class RandomNumberAdder {

    public static void main(String[] args) {

        int firstRandomNumber;
        int secondRandomNumber;
        int thirdRandomNumber;
        Random randomNumberGenerator = new Random();
        firstRandomNumber = randomNumberGenerator.nextInt();
        secondRandomNumber = randomNumberGenerator.nextInt();
        thirdRandomNumber =  randomNumberGenerator.nextInt();
        System.out.println(firstRandomNumber + secondRandomNumber + thirdRandomNumber);

    }
}
