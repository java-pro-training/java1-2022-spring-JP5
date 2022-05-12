package lv.lu.training;

import java.util.Random;

public class RollDice {
    public static void main(String[] args) {
        int dice1;
        int dice2;

        Random random = new Random();

        dice1 = random.nextInt(6);
        dice2 = random.nextInt(6);
        int result = (dice1 + dice2);

        switch (result){
            case 7:
                System.out.println("Congrautulations, you've won!");
                break;
            case 11:
                System.out.println("Congratulations, you've won!");
                break;
            default:
                System.out.println("Better luck next time :)");

        }

    }
}
