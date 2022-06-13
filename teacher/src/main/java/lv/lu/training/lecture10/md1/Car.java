package lv.lu.training.lecture10.md1;

public class Car {
    private final String color;
    private final int year;
    private final String manufacturer;

    public Car(String color, int year, String manufacturer){
        this.color = color;
        this.year = year;
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", year=" + year +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
