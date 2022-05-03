package lv.lu.training.homework4;

import java.util.Random;

public class RollDice {
    public static void main(String[] args) {
        Random random = new Random();

        int dice1 = random.nextInt();
        int dice2 = random.nextInt();
        int result = dice1 + dice2;

        if (result == 7 || result == 11) {
            System.out.println("You have won the game!");
        } else {
            System.out.println("You have lost the game");
        }
    }
}
