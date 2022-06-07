package lv.lu.training.lecture10.lecture;

import java.util.Random;

public class RandomStringGenerator {
    public static String getRandomString(){
        Random random = new Random();
        int number = random.nextInt(3);
        if(number == 0){
            return "John";
        } else if (number == 1){
            return "Peter";
        } else {
            return null;
        }
    }
}
