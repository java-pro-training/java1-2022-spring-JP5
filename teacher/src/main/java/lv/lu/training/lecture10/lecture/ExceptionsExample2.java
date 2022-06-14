package lv.lu.training.lecture10.lecture;

import java.io.IOException;

public class ExceptionsExample2 {
    public static void main(String[] args) {

        String result = RandomStringGenerator.getRandomString();
        try {
            if (result.equals("Peter")){
                throw new NewException("Ir notikusi kljume");
            }
            if(!result.isEmpty()){
                System.out.println("Result " + result + " is not empty");
            }
        } catch (NewException exception){
            System.out.println("Ir noticis NewException");
            System.out.println("Pārrakstīsim result vērtību uz Jeremy");
            result = "Jeremy";
        } catch (NullPointerException exception){
            System.out.println("Ir noticis NullPointerException");
            System.out.println("Pārrakstīsim result vērtību uz Bruce");
            result = "Unknown user";
        }

        System.out.println("Result ir:" + result);
        System.out.println("Programmas beigas");
    }
}
