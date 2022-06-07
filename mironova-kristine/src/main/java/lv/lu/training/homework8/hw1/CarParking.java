package lv.lu.training.homework8.hw1;

import java.util.Arrays;
import java.util.List;

public class CarParking {
    public static void main(String[] args) {
        Buss myNewBuss = new Buss("Red", 2020, "Volvo", 50);
        Buss myOldBuss = new Buss("Yellow", 1990, "Man", 15);

        System.out.println("My new buss " + myNewBuss);
        System.out.println("My old buss " + myOldBuss);
        System.out.println("Are busses equals: " + myNewBuss.equals(myOldBuss));

        Truck myTruck = new Truck("black", 2010, "Man", 3000);
        Car myCar = new Car("Green", 2021, "BMW");

        List<Car> allMyVehicles = Arrays.asList(myCar, myNewBuss, myOldBuss, myTruck);
        for (Car car : allMyVehicles) {
            System.out.println(car);

        }
    }
}