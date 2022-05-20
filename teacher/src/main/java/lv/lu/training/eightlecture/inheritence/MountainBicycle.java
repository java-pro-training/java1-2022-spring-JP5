package lv.lu.training.eightlecture.inheritence;

public class MountainBicycle extends Bicycle {
    protected int gear;

    public MountainBicycle(String brand, int speed, int gear) {
        super(brand, speed);
        this.gear = gear;
    }

    public void changeGear(int gear) {
        this.gear = gear;
    }

    @Override
    public String toString() {
        return "MountainBicycle{" +
                "gear=" + gear +
                "brand='" + brand + '\'' +
                ",speed = " + speed +
        '}';
    }
}