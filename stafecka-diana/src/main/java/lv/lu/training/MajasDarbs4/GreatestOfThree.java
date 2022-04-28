package lv.lu.training.MajasDarbs4;

import javax.swing.*;
import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int thirdNumber;
        System.out.println("Enter your first number and press enter to continue : ");
        firstNumber = scanner.nextInt();
        System.out.println("Enter your second number and press enter to continue : ");
        secondNumber = scanner.nextInt();
        System.out.println("Enter your third number and press enter to continue : ");
        thirdNumber = scanner.nextInt();
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("The highest number is first");
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("the highest number is second");
       // } else if (thirdNumber < secondNumber) {
            //System.out.println("Second number is the highest from three");
        } else {
            System.out.println("The highest number is third");

        }
    }
}

