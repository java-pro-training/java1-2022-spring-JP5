package lv.lu.training.secondconsult.vehicle;

public class Bicycle extends Vehicle implements Driveable{

    @Override
    public void drive() {
        System.out.println("I'm a Bicycle, i'm driving");
    }
}
