package lv.lu.training.MajasDarbs4;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number:");
        int number1 = scanner.nextInt();
        System.out.println("Please enter number:");
        int number2 = scanner.nextInt();
        System.out.println("Please enter number:");
        int number3 = scanner.nextInt();

        if (number1 >= number2 && number1 >= number3) {
            System.out.println("The greatest number is number1 -  " + number1);
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println("The greatest number is number2 - " + number2);
        } else {
            System.out.println("The greatest number is number3 - " + number3);
        }

    }
}
