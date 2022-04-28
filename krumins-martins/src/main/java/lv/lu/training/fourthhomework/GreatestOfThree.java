package lv.lu.training.fourthhomework;

import java.util.Scanner;

public class GreatestOfThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        // ja kāds no 3 skaitļiem atkārtosies un būs vienalaicīgi lielākais, tad tiks izvadīta tā pirmā instance
        // piemēram ievadot 0, 2, 2 atbilde būs "Second number is the highest!"
        // jo uzdevumā nav minēts vēlamais rezultāts šajā gadījumā
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println("First number is the highest!");
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println("Second number is the highest!");
        } else {
            System.out.println("Third number is the highest!");
        }

    }

}
