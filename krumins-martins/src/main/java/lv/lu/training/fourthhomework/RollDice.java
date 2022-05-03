package lv.lu.training.fourthhomework;

import java.util.Random;

public class RollDice {

    public static void main(String[] args) {

        Random random = new Random();
        int dice1 = random.nextInt(5) + 1;
        int dice2 = random.nextInt(5) + 1;
        int result = dice1 + dice2;

        if (result == 7 || result == 11) {
            System.out.println("You win!");
        } else {
            System.out.println("You loose!");
        }

    }

}
