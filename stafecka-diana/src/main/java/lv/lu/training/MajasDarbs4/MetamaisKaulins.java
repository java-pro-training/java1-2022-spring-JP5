package lv.lu.training.MajasDarbs4;

import java.util.Random;

public class MetamaisKaulins {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        randomNumberGenerator.nextInt();


        int number1 = randomNumberGenerator.nextInt(5);
        int number2 = randomNumberGenerator.nextInt(5);
        int result1 = number1 + 1;
        int result2 = number2 + 1;
        int result3 = result1 + result2;

        //System.out.println(result1);
        //System.out.println(result2);
        System.out.println(result3);


        int number = result3;
        switch (number) {
            case 7:
            case 11:
                System.out.println("Congratulation - You have won!!! Yout lucky number was "+ result3);
                break;
            default:
                System.out.println("Your number is " + result3 + "! To win you need 7 or 11. Try again later!");


        }
    }
}


