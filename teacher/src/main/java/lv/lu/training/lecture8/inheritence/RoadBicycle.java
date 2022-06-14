package lv.lu.training.lecture8.inheritence;

public class RoadBicycle extends Bicycle{

    private boolean isSponsored;

    public RoadBicycle(String brand, int speed, boolean isSponsored) {
        super(brand, speed);
        this.isSponsored = isSponsored;
    }
}
