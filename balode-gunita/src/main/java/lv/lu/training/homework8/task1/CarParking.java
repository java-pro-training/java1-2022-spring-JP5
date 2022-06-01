package lv.lu.training.homework8.task1;

//Parbaudit, ka darbojas equals un toString metodes, izveidojot jaunu klasi:

import java.util.Arrays;
import java.util.List;

public class CarParking {

    public static void main(String[] args) {
        Buss myNewBuss = new Buss("White", 2022, "Volvo", "Automatic", 20);
        Buss myOldBuss = new Buss("Black", 2000, "Scania", "Manual", 20);

        System.out.println("My new buss: " +myNewBuss);
        System.out.println("My old buss: " +myOldBuss);
        System.out.println("Are buses equals: " +myNewBuss.equals(myOldBuss));

        Truck myTruck = new Truck("Blue", 2010, "Volvo", 22, "Crane");
        Car myCar = new Car("Red", 2022, "Tesla");

        //Visi objekti ievietoti viena saraksta List:
        List<Car> allMyVehicles = Arrays.asList(myNewBuss, myOldBuss, myTruck, myCar);
        for (Car car : allMyVehicles) {
            System.out.println(car);
        }

    }

}
