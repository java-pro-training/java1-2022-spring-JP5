package lv.lu.training.Lekcija4;

import java.util.Scanner;

public class CreatestOfThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet pirmo skaitli");
        int firstNumber = scanner.nextInt();

        System.out.println("Ievadiet otro skaitli");
        int secondNumber = scanner.nextInt();

        System.out.println("Ievadiet tresho skaitli");
        int thirdNumner = scanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumner) {
            System.out.println("Pirmais numurs ir lielaks - " + firstNumber);
        } else  if (secondNumber > firstNumber && secondNumber > thirdNumner) {
            System.out.println("Otrais numurs ir lielkas - " +secondNumber);
        } else {
            System.out.println("Treshais numurs ir lielaks - "+ thirdNumner);
        }
    }
}
