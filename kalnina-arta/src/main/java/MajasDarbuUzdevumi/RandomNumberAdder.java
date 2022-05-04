package MajasDarbuUzdevumi;

import javax.xml.transform.Result;
import java.util.Random;

public class RandomNumberAdder {

    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        randomNumberGenerator.nextInt();
        int random1 = randomNumberGenerator.nextInt();
        int random2 = randomNumberGenerator.nextInt();
        int random3 = randomNumberGenerator.nextInt();
        int Result = (random1+random2+random3);
        System.out.println(Result);


    }
}
