package lv.lu.training.klase;
import java.util.Random;
import java.util.Scanner;

public class OtraisUzdevums {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean isEqual = false;
        int enteredNumber;
        while (!isEqual) {
            enteredNumber = scanner.nextInt();
            if (randomNumber > enteredNumber)
                System.out.println("Par zemu, megini velreiz");
            else if (randomNumber < enteredNumber)
            { System.out.println("Par lielu, megini velreiz!");}

else
{
    isEqual=true;
            }
        }
        System.out.println("Tu uzmineji pareizi, skaitlis bija " + randomNumber);
    }
}




