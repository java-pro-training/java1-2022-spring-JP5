package lv.lu.training.lecture6;

import java.util.Random;

public class ForLoop {
    public static void main(String[] args) {


        System.out.println("\nFor (int i = 0; i < 5; i++ ): ");
        for (int i = 0; i < 5; i++ ) {
            System.out.print("i = " + i + "; ");
        }

        System.out.println("\n\nFor (int i = 4; i >= 0; i-- ): ");
        for (int i = 4; i >= 0; i-- ) {
            System.out.print("i = " + i + "; ");
        }

        int temp;
        int laiks = 1;

        while (laiks < 100) {
            temp = getTemperature();
            if (temp > 23) {
                System.out.println("Temperature is too high = [ " + temp + " ], stopping the system!");
                stopTheSystem();
                break;
            }
            if (temp == 11){
                System.out.println("Temperature is 11 ! The lucky temperature!");
                continue;
            }
            runningSystem();
            System.out.println("Temperature is: " + temp);
            laiks++;
        }


    }

    static int getTemperature() {
        Random random = new Random();
        return random.nextInt(25);
    }

    static void stopTheSystem() {
        System.out.println("Stopping the system!");
    }

    static void runningSystem() {
        System.out.println("The system is running!");
    }
}
