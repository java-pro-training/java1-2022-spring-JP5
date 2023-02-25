package lv.lu.training.MajasDarbs4;

import java.util.Scanner;

public class GreatestOfThree {
    int firstNumber;
    int secondNumber;
    int thirdNumber;
    int greatestNumber;
    Scanner scanner = new Scanner(System.in);

    int getFirstNumber(){
        System.out.println("Please enter first number: ");
        firstNumber = scanner.nextInt();
        return firstNumber;
    }

    int getSecondNumber() {
        System.out.println("Please enter second number: ");
        secondNumber = scanner.nextInt();
        return secondNumber;
    }

    int getThirdNumber() {
        System.out.println("Please enter third number: ");
        thirdNumber = scanner.nextInt();
        return thirdNumber;
    }



    public int getGreatestNumber() {
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println("The greatest number is number1 -  " + firstNumber);
            return firstNumber;
        } else if (secondNumber>= firstNumber && secondNumber >= thirdNumber) {
            System.out.println("The greatest number is number2 - " + secondNumber);
            return secondNumber;
        } else {
            System.out.println("The greatest number is number3 - " + thirdNumber);
            return thirdNumber;
        }

    }
}
