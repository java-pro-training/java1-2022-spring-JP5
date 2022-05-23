package lv.lu.training.homework6;
import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if (firstNumber>secondNumber && firstNumber>thirdNumber){
            System.out.println("Lielakais skaitlis ir "+firstNumber);
        }
        else if (secondNumber>firstNumber && secondNumber>thirdNumber){
            System.out.println("Lielakais skaitlis ir "+secondNumber);
        }
    else {
            System.out.println("Lielakais skaitlis ir "+thirdNumber);
        }
    }
}
