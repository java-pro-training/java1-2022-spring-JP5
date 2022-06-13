package lv.lu.training._8.md;

public class Truck extends Car {

    private long loadCapacity;

    public Truck (String color, int year, String manufacturer, long loadCapacity) {
        super(color,year,manufacturer);
        this.loadCapacity = loadCapacity;
    }

    public String toString() {
        return "Truck{" +
                "color='" + getColor() + '\'' +
                ", year=" + getYear() +
                ", manufacturer='" + getManufacturer() + '\'' +
                '}';
    }
}
