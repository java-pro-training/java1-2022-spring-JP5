package lv.lu.training.nodarbiba9;

import java.util.ArrayList;
import java.util.List;

public class CarTask {
    public static void main(String[] args) {
        List<String> carName = new ArrayList<>(4);
        carName.add("BMW");
        carName.add("Seat");
        carName.add("Volvo");
        carName.add("Mercedes");

        System.out.println(carName);
        System.out.println(carName.size());


    }


}
