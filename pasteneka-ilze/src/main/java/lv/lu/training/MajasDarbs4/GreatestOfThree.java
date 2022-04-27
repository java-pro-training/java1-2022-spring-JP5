package lv.lu.training.MajasDarbs4;
import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        System.out.println("First number entered " + firstNumber);
        System.out.println("Second number entered " + secondNumber);
        System.out.println("Third number entered " + thirdNumber);
        if(firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("The greatest number is " + firstNumber);}
        else if(secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("The greatest number is " + secondNumber);}
        else if (thirdNumber > firstNumber && thirdNumber > secondNumber){
            System.out.println("The greatest number is " + thirdNumber);
        }
    }
}