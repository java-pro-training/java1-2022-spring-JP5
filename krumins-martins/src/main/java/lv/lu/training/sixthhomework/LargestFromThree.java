package lv.lu.training.sixthhomework;

import java.util.Scanner;

public class LargestFromThree {
    public static void main(String[] args) {

        int input;
        int largest = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 4 ; i++) {
            System.out.println("Please enter " + i + ". number.");
            input = scanner.nextInt();
            if (i == 1) {
                largest = input;
            } else if (input > largest) {
                largest = input;
            }
        }
        System.out.println("Largest number from three is " + largest + ".");
    }
}
