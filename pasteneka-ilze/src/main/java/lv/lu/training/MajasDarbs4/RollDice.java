package lv.lu.training.MajasDarbs4;
import java.util.Random;
public class RollDice {
    public static void main(String[] args) {
        int dice1;
        int dice2;
        Random random = new Random();
        dice1 = random.nextInt(1,6);
        System.out.println(dice1);
        dice2 = random.nextInt(1,6);
        System.out.println(dice2);
        int result = dice1 + dice2;
        switch (result) {
            case 2, 3, 4, 5, 6, 8, 9, 10, 12 -> System.out.println("Game is over!");
            case 7, 11 -> System.out.println("YOU ARE THE WINNER!!!");
        }
    }
}
