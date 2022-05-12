package lv.lu.training.homework3;
import java.util.Random;
public class RandomNumberAdder {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        int random1 = randomNumberGenerator.nextInt(6);
        int random2 = randomNumberGenerator.nextInt(16);
        int random3 = randomNumberGenerator.nextInt(11);

        int result = random1 + random2 + random3;
        System.out.println("Rezultats" + " = " + result);
    }
}
