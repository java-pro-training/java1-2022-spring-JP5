package lv.lu.training;

import java.util.Random;

public class RollDiceSecond {

    public static void main(String[] args) {

        //izveido objektu
        Random random = new Random();

        //deklare mainigos,define izejas punktus (...=0;)
        int dice1;
        int dice2;
        int diceSum = 0;
        int sumOfWins = 0;
        int sumOfLoss = 0;

        while (diceSum < 12) {

            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
            diceSum = dice1 + dice2;

            if (diceSum == 7 || diceSum == 11) {
                sumOfWins++;
                System.out.println("Sum of Wins: " + sumOfWins);

            } else if (diceSum == 2 || diceSum == 3 || diceSum == 6) {
                sumOfLoss++;
                System.out.println("Sum of Loss: " + sumOfLoss);
            } else if (diceSum == 12) {
                System.out.println("You lose!");
            } else {
                System.out.println("Try again!");
            }

        }
    }

}













