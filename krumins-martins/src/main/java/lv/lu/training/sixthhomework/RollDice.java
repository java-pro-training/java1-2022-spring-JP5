package lv.lu.training.sixthhomework;

import java.util.Random;

public class RollDice {

    public static void main(String[] args) {

        Random random = new Random();
        int dice1; // +1 ir JDK versijas dēļ, jo jaunākās tiek abalstīti no/līdz parametri
        int dice2; // taču mums ir jāstrādā ar JDK 8
        int diceSum = 0;
        int sumOfWins = 0;

        while(diceSum != 12) {
            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
            diceSum = dice1 + dice2;

            if (diceSum == 7 || diceSum == 11) {
                sumOfWins++;
                System.out.println("You have won!");
            } else if (diceSum == 2|| diceSum == 3 || diceSum == 6) {
                System.out.println("You have lost!");
            }
        }
        System.out.println("You have won " + sumOfWins + " times.");
    }
}
