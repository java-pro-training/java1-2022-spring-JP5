package lv.lu.training;

import java.util.Random;

public class HelloWorld
{
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(305);
        System.out.println(randomNumber);
        System.out.println(10>5);

    }
}
