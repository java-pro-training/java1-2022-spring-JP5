package lv.lu.training.ninthlecture;

import java.util.ArrayList;
import java.util.List;

public class CarTask {
    public static void main(String[] args) {

        //Uzdevums
        // Izveidot arrayList ar 4 mašīnu nosaukumiem un izvadīt to marku, kas satur visvairāk burtu
        List<String> carNames = new ArrayList<>(4);
        carNames.add("Volvo");
        carNames.add("BMW");
        carNames.add("Mercedes");
        carNames.add("Toyota");

        String result = carNames.get(0);
        for (String carName: carNames) {
            if(carName.length() < result.length()){
                result = carName;
            }
        }
        System.out.println("Resulting car is :" + result);
    }
}
