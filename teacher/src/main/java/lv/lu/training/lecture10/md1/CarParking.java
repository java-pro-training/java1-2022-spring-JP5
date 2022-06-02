package lv.lu.training.lecture10.md1;

import java.util.Arrays;
import java.util.List;

public class CarParking {
    public static void main(String[] args) {
        Buss myNewBuss = new Buss("Red", 2020, "Volvo", 50);
        Buss myOldBuss = new Buss("Yellow", 1990, "Man", 15);
        Buss thirdBuss = new Buss("Yellow", 1990, "Man", 15);
        Truck myTruck = new Truck("black", 2010, "Man", 3000);
        Car myCar = new Car("Green", 2021, "BMW");

        System.out.println("myNewBuss: " + myNewBuss);
        System.out.println("myOldBuss: " + myOldBuss);
        System.out.println("Are busses equals: " + myNewBuss.equals(myOldBuss));
        System.out.println("Are busses equals: " + thirdBuss.equals(myOldBuss));

        List<Car> allMyVehicles = Arrays.asList(myNewBuss, myOldBuss, thirdBuss, myTruck, myCar);

        for (Car car : allMyVehicles) {
            System.out.println(car);
        }
    }
}