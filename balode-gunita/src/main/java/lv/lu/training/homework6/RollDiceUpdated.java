package lv.lu.training.homework6;

import java.util.Random;

public class RollDiceUpdated {
    public static void main(String[] args) {

        //dekalre mainigos
        int dice1;
        int dice2;
        int diceSum = 0;

        //izveidot objektu java.util.Random objektu, ar kura palidzibu tiks genereti skaitli
        Random random = new Random();

        //Vinnesta un zaudejuma saskaitisanas definesana, kas sakas no nulles
        int sumOfWins = 0;
        int sumOfLoss = 0;

        //nosacijumu definesana
        while (diceSum != 12) {
            //mainigajiem pieskirt vertibas no 1 lidz 6
            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
            System.out.println("Dice #1 = " + dice1);
            System.out.println("Dice #2 = " + dice2);

            //mainigo saskaitisana
            diceSum = dice1 + dice2;
            System.out.println("Sum of Dice = " + diceSum);

            if (diceSum == 7 || diceSum == 11) {
                sumOfWins++;
                System.out.println("The game is won!");
                System.out.println("Won games: " + sumOfWins);
            } else if (diceSum == 2 || diceSum == 3 || diceSum == 6) {
                sumOfLoss++;
                System.out.println("The game is lost!");
                System.out.println("Lost games: " + sumOfLoss);
            } else {
            }
        }
        System.out.println("Won games Total: " +sumOfWins);
        System.out.println("Lost games Total: " +sumOfLoss);
        System.out.println("The game is over!");
    }
}
