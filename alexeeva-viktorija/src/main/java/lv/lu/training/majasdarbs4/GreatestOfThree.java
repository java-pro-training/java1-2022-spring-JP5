package lv.lu.training.majasdarbs4;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println(firstNumber + " - First number is the greatest");
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println(secondNumber + " - Second number is the greatest");
        } else {
            System.out.println(thirdNumber + " - Third number is the greatest");
        }
    }
}
