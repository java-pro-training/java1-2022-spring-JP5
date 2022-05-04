package majasdarbs3;

import java.sql.ResultSet;
import java.util.Random;

public class RandomNumberAdder {
    public static void main(String[] args) {

      Random randomNumberAdder = new Random();

      int x1 = randomNumberAdder.nextInt(16);

        int x2 = randomNumberAdder.nextInt((16)+1);

        int x3 = 100 + randomNumberAdder.nextInt(500- 100);



        int result = (x1+x2+x3);



        System.out.println("Rezultats" +  result);




    }
}
