package lv.lu.training.majasdarbs8;

public class Truck extends Car{
    private long loadCapacity;

    public Truck(String color, int year, String manufacturer, long loadCapacity) {
        super(color, year, manufacturer);
        this.loadCapacity = loadCapacity;
    }
}
