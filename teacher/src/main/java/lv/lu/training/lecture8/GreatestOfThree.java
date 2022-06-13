package lv.lu.training.lecture8;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter second number:");
        int secondNumber = scanner.nextInt();

        System.out.println("Please enter third number:");
        int thirdNumber = scanner.nextInt();

        if(firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println("First number is the biggest and it was: " + firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber){
            System.out.println("Second number is the biggest and it was:" + secondNumber);
        } else {
            System.out.println("Third number is the biggest and it was: " + thirdNumber);
        }
    }
}
