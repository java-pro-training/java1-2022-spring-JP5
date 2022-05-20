package lv.lu.training;

import java.util.Random;

public class RollDiceSecond {

    public static void main(String[] args) {

        Random random = new Random();
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        int diceSum = dice1 + dice2;


        int sumOfWins = 0;
        int sumOfLoss = 0;

        while(diceSum != 12){
          if (diceSum == 7 || diceSum == 11){
              sumOfWins++;
              System.out.println("Sum of Wins is: " + sumOfWins);
          }
        }

        while(diceSum != 12) {
            if (diceSum == 2 || diceSum == 3 || diceSum == 6){
                sumOfLoss++;
                System.out.println("Sum of Loss is: " + sumOfLoss);
            }
        }



        }




}
