package lv.lu.training.MD8;

import java.util.Arrays;
import java.util.List;

public class CarParking {
    public static void main(String[] args) {
        Bus myNewBuss = new Bus("Red", 2020, "Volvo", 50);
        Bus myOldBuss = new Bus("Yellow", 1990, "Man", 15);
        System.out.println("myNewBuss: " + myNewBuss);
        System.out.println("myOldBuss: " + myNewBuss);
        System.out.println("Are busses equals: " +
                myNewBuss.equals(myOldBuss));
        truck myTruck = new truck("black", 2010, "Man", 3000);
        Car myCar = new Car("Green", 2021, "BMW");
        List<Car> allMyVehicles = Arrays.asList(myNewBuss, myOldBuss,
                myTruck, myCar);
        for (Car car : allMyVehicles) {
            System.out.println(car);
        }
    }
}
