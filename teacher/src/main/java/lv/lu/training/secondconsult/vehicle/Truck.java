package lv.lu.training.secondconsult.vehicle;

public class Truck extends Vehicle implements Driveable{

    int wheels = 4;

    public int getWheels() {
        return wheels;
    }

    @Override
    public void drive() {
        System.out.println("I'm a truck, im driving");
    }
}
