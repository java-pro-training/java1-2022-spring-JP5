package lv.lu.training.homework4;

import javax.xml.transform.Result;
import java.util.Random;

public class rollDice {
    public static void main(String[] args) {

        Random random = new Random();

        int dice1 = random.nextInt(6)+1;

        int dice2 = random.nextInt(6)+1;

         int Result = dice1+dice2;


         if (Result == 7 || Result ==11){
            System.out.println("win!");
         }else{
            System.out.println(" loose!");
        }





    }
}
