package lv.lu.training;

import java.util.Random;

public class Helloworld {

public static void main(String[] args) {
    int pirmaisMainigais = 10;
    int otraisMainigais = 20;
    int tresaisMainigais = pirmaisMainigais + otraisMainigais;
    System.out.println(tresaisMainigais);

    Random randomGenerator = new Random();
    int randomNumber = randomGenerator.nextInt(101);
    System.out.println(randomNumber);

    //O.L. IntelliJ jau iekrāso mainīgo trešaisMainīgais un saka, ka Non-ASCII characters are identified.
    // Tas visticamāk norāda uz to, ka tam nepatīk mīkstinājuma zīmes. Vēlams mainīgo nosaukumus rakstīt angļu valodā,
    // tad nebūs tādu paziņojumu.
}


}