package lv.lu.training.majasdarbs6;

import java.util.Random;

public class RollDiceNew {
    public static void main(String[] args) {
        Random random = new Random ();

        int dice1 = random.nextInt( 1,  7 );
        int dice2 = random.nextInt(1,7);

        int result = dice1 + dice2;

        int sumOfWins = 0;
        int sumOfLoses = 0;

        while (result < 12) {

            if (result == 7 || result == 11) {
                sumOfWins ++;
                System.out.println("You win " + sumOfWins + " times");

            } else if (result == 2 || result == 3 || result == 6) {
                sumOfLoses ++;
                System.out.println("You lose " + sumOfLoses + " times");

            } else {
                System.out.println("Try again");
            }
        }
    }
}
