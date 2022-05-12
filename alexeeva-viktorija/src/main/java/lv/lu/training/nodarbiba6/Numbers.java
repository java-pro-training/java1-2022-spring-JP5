package lv.lu.training.nodarbiba6;


import java.util.Scanner;
import java.util.Random;

public class Numbers {
    public static void main(String[] args) {


    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int randomNumber = random.nextInt(15);
    int myNumber = 0;

    while (myNumber != randomNumber) {
        System.out.println("Please enter a number:");
    myNumber = scanner.nextInt();

    if ( myNumber > randomNumber) {
        System.out.println("too much, try again");
    } else if (myNumber < randomNumber) {
        System.out.println("too small, try again");
    } else {
        System.out.println( "Number is the same");
    }
}
    }
}