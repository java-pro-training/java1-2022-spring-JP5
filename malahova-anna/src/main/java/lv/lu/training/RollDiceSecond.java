package lv.lu.training;

import java.util.Random;

public class RollDiceSecond {

    public static void main(String[] args) {

        Random random = new Random();
        int dice1 = random.nextInt(6)+1;
        int dice2 = random.nextInt(6)+1;
        int result = dice1 + dice2;

        if (result == 7) {
            System.out.println("You win!!!");
        } else if (result == 11) {
            System.out.println("You win!!!");
        } else {
            System.out.println("You loss!");
        }


    }
}
