package lv.lu.training.homework4;

import java.util.Random;

public class RollDice {
    public static void main(String[] args) {

        //dekalre divus mainigos
        int dice1;
        int dice2;

        //izveidot objektu java.util.Random objektu, ar kura palidzibu tiks genereti skaitli
        Random random = new Random();

        //mainigajiem pieskirt vertibas
        dice1 = random.nextInt(6) + 1;
        dice2 = random.nextInt(6) + 1;
        System.out.println("Dice #1 = " + dice1);
        System.out.println("Dice #2 = " + dice2);

        //mainigo saskaitisana
        int result = dice1 + dice2;

        System.out.println("Dice Roll result = " + result);

        //nosacijumu definesana
        if (result == 2 || result == 3 || result == 4 || result == 5 || result == 6 || result == 8 || result == 9 || result == 10 || result == 12) {
            System.out.println("The game is lost!");
        } else if (result == 7 || result == 11) {
            System.out.println("The game is won!");
        }

    }
}
