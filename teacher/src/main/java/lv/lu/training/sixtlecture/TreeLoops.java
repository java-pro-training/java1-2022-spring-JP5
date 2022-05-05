package lv.lu.training.sixtlecture;

import java.util.Random;
import java.util.Scanner;

public class TreeLoops {
    public static void main(String[] args) {
        /**
         * Uzdevums 1: Izmantojot for ciklu, izveidot kodu, kas izprintē # atbilstoši padotajam skaitlis:
         * (Un kā šo varētu izpildīt ar while ciklu)
         * Gadījums, kad skaitlis = 3
         * #
         * ##
         * ###
         *
         * Gadījums, kad skaitlis = 5
         * #        1x#
         * ##       2x#
         * ###      3x#
         * ####     4x#
         * #####    5x#
         */

        int skaitlis = 5;
        int i = 0;
        while (i < skaitlis) {
            System.out.println("#".repeat(i + 1));
            i++;
        }

        /**
         * Uzdevums 2: Uzraksti programmu, kas veido random skaitli un jautā lietotājam uzminēt šo skaitli.
         * Ja lietotājs uzmin lielāku skaitli, tad programmai jāsaka - "Par lielu, mēģini vēlreiz"
         * Ja lietotājs uzmin mazāku skaitli, tad programmai jāsaka - "Par zemu, mēģini vēlreiz"
         * Programma iet ciklā, līdz brīdim, kad lietotājs uzmin skaitli
         */
        //Variants 1.
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(11); // 0 - 10
        int enteredNumber = -1;
        while (enteredNumber != randomNumber) {
            System.out.println("Please enter an number:");
            enteredNumber = scanner.nextInt();
            if (enteredNumber > randomNumber) {
                System.out.println("Entered number is too big, try again!");
            } else if (enteredNumber < randomNumber) {
                System.out.println("Entered number is too small, try again");
            }
        }
        System.out.println("You guessed the number correctly, it was:" + randomNumber);

        //Variants 2.
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int randomNumber = random.nextInt(11); // 0 - 10
//        int enteredNumber;
//        boolean isEqual = false;
//        while (!isEqual) {
//            System.out.println("Please enter an number:");
//            enteredNumber = scanner.nextInt();
//            if (enteredNumber > randomNumber) {
//                System.out.println("Entered number is too big, try again!");
//            } else if (enteredNumber < randomNumber) {
//                System.out.println("Entered number is too small, try again");
//            } else {
//                isEqual = true;
//            }
//        }
//        System.out.println("You guessed the number correctly, it was:" + randomNumber);
    }
}
