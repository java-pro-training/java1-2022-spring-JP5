package lv.lu.training;

import java.util.Random;

public class randoms {

    public static void main(String[] args) {
        Random generator = new Random();
                int randomNumber = generator.nextInt(101);
        System.out.println(randomNumber
        );
    }
}
