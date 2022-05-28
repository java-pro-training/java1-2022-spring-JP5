package lv.lu.training.secondconsult.vehicle;

public class Car extends Vehicle implements Driveable{

    @Override
    public void drive() {
        System.out.println("I'm a car, i'm driving");
    }
}
