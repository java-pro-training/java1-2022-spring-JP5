package lv.lu.training.ninthlecture;

import java.util.Random;

public class RollDiceNew {
    public static void main(String[] args) {

        Random random = new Random();
        int dice1;
        int dice2;
        int result = -1;
        int sumOfWins = 0;
        int sumOfLoses = 0;

        while (result != 12) {
            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
            result = dice1 + dice2;

            System.out.println("Result is: " + result);
            if (result == 7 || result == 11) {
                sumOfWins++;
                System.out.println("You have won! Win count: " + sumOfWins + " Loss ccount: " + sumOfLoses);
            } else if (result == 2 || result == 3 || result == 6) {
                sumOfLoses++;
                System.out.println("You have lost! Win count: " + sumOfWins + " Loss ccount: " + sumOfLoses);
            } else if (result == 12) {
                System.out.println("You got 12, game has ended!");
            } else {
                System.out.println("Try again!");
            }
        }
    }
}
