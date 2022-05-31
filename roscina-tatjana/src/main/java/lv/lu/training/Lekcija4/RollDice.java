package lv.lu.training.Lekcija4;

import java.util.Random;

public class RollDice {
    public static void main(String[] args) {
        int dice1;
        int dice2;

        Random random = new Random();

        dice1 = random.nextInt(6)+1;
        dice2 = random.nextInt(6)+1;

        int result = dice1+dice2;

        if (result == 7 || result == 11){
            System.out.println("Jus vinnejat");
        } else {
            System.out.println("Jus zaudejat");
        }
    }
}
