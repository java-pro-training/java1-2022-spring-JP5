package lv.lu.training;

import java.util.Random;

public class RandomNumberAdder {
    public static void main(String[] args) {


Random randomNunberGenerator = new Random();
int randomNumber1 = randomNunberGenerator.nextInt();
int randomNumber2 = randomNunberGenerator.nextInt();
int randomNumber3 = randomNunberGenerator.nextInt();
int result = (randomNumber1+randomNumber2+randomNumber3);

        System.out.println(result);
    }

}

