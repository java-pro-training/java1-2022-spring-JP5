package lv.lu.training.eightlecture.inheritence;

public class CityBicycle extends Bicycle{

    public CityBicycle(String brand, int speed) {
        super(brand, speed);
    }

    public void putItemInBasket(String item) {
        System.out.println("Item" + item + " has been added to the basket");
    }
}
