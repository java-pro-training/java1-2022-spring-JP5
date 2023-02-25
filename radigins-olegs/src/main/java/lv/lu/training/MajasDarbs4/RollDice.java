package lv.lu.training.MajasDarbs4;

import java.util.Random;

public class RollDice {
    public static void main(String[] args) {
       Random  random = new Random();

        int dice1 = random.nextInt(6) + 1;
        System.out.println(dice1);
        int dice2 = random.nextInt(6) + 1;
        System.out.println(dice2);
        int result = dice1 + dice2;
        System.out.println("Result = " + result);
        if (result == 11 | result == 7){
            System.out.println("Spēle ir vinnēta.");

        } else {
            System.out.println("Spēle ir zaudēta.");

        }
    }
}
