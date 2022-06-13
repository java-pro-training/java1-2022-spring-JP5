package lv.lu.training._8.md;

import java.util.Arrays;
import java.util.List;

public class Carparking {
    public static void main(String[] args) {

        Buss myNewBuss = new Buss("Red", 2020, "Volvo", 50);
        Buss myOldBuss = new Buss("Yellow", 1990, "Man", 15);
        Buss thirdBuss = new Buss("Yellow", 1990, "Man", 15);
        Truck myTruck = new Truck("black", 2000, "BMW",20);
        Car myCar = new Car("Red", 2020,"Lexus");

        System.out.println("myNewBuss: " + myNewBuss);
        System.out.println("myOldBuss: " + myNewBuss);
        System.out.println("Are busses equals: " + myNewBuss.equals(myOldBuss));
        System.out.println("Are busses equals: " + thirdBuss.equals(myOldBuss));

        List<Car> allMyWechiles = Arrays.asList(myNewBuss,myOldBuss,myTruck,myCar);

        for (Car car : allMyWechiles) {
            System.out.println(car);
        }

    }
}
