package lv.lu.training;

import java.util.Random;

public class RandomNumberGenerator {
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

        //O.L Ļoti labi. Triviāls komentārs - klases nosaukums ir RandomNumberGenerator, bet tika prasīts RandomNumberAdder
    }
}
