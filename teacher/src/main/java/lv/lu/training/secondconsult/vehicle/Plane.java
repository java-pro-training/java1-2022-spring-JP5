package lv.lu.training.secondconsult.vehicle;

public class Plane extends Vehicle implements Flyable{

    @Override
    public void fly() {
        System.out.println("I'm a plane, I'm flying");
    }
}
