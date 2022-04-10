package lv.lu.training;

import java.util.Random;

public class Helloworld {

public static void main(String[] args) {
    int pirmaisMainigais = 10;
    int otraisMainigais = 20;
    int trešaisMainigais = pirmaisMainigais + otraisMainigais;
    System.out.println(trešaisMainigais);

    Random randomGenerator = new Random();
    int randomNumber = randomGenerator.nextInt(101);
    System.out.println(randomNumber);
}


}