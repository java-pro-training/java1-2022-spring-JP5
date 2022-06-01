package lv.lu.training.klase;

import java.util.ArrayList;
import java.util.List;

public class klasesUzdevums9 {
    public static void main(String[] args) {

        // izveidot arraylisti ar 4 masinu nosaukumiem un izvadit to marku, kas satur visvairak burtu


        List<String> carNames = new ArrayList<>(4);
        carNames.add("Volvo");
        carNames.add("BMW");
        carNames.add("Mercedes");
        carNames.add("Toyota");

        String result = carNames.get(0);

        for (String carName: carNames){

            System.out.println(carName);
            System.out.println(carName.length());

            if(result.length() < carName.length()){
                result= carName;


            }
        }
        System.out.println("resulting car is :"+result);

    }
}
