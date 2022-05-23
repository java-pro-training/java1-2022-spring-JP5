package lv.lu.training.eightlecture.inheritence;

import lv.lu.training.eightlecture.abstraction.Singer;

public class RoadBicycle extends Bicycle{

    private boolean isSponsored;

    public RoadBicycle(String brand, int speed, boolean isSponsored) {
        super(brand, speed);
        this.isSponsored = isSponsored;
    }
}
