package lv.lu.training.secondconsult.vehicle;

public class Scooter extends Vehicle implements Driveable{

    int wheels = 2;

    @Override
    public void drive() {
        System.out.println("I'm a scooter, im driving");
    }
}
