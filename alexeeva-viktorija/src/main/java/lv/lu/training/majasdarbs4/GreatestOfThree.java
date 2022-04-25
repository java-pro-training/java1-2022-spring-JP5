package lv.lu.training.majasdarbs4;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt(5);
        int secondNumber = scanner.nextInt(8);
        int thirdNumber = scanner.nextInt(12);

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println(firstNumber + "the greatest");
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println(secondNumber + "the greatest");
        } else {
            System.out.println(thirdNumber + "the greatest");
        }
    }
}
