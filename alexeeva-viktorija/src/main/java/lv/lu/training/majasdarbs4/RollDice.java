package lv.lu.training.majasdarbs4;

import java.util.Random;

public class RollDice {
    public static void main(String[] args) {
        Random random = new Random ();

        int dice1 = random.nextInt( 1,  7 );
        int dice2 = random.nextInt(1,7);

        int result = dice1 + dice2;

        System.out.println("Resultats = " + result);

        if ((result == 7)||(result == 11)) {
            System.out.println("Spele ir vinneta!");
        } else {
            System.out.println("Spele ir zaudeta!");
        }

    }
}
