package lv.lu.training.homework4;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        //Klases Scanner objekta izveidosana, lai nolasitu lietotaja ievadito skaitli
        Scanner scanner = new Scanner(System.in);
        //Klases Scanner importesana

        //Mainigo definesana katram skaitlim, izmantojot scanner.nextInt()
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        System.out.println("The 1st number you entered was: " + firstNumber);
        System.out.println("The 2nd number you entered was: " + secondNumber);
        System.out.println("The 3rd number you entered was: " + thirdNumber);

        //Skaitlu salidzinasana
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println("The greatest number is " + firstNumber);
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println("The greatest number is " + secondNumber);
        } else {
            System.out.println("The greatest number is " + thirdNumber +" !!");
        }

    }
}
