package lv.lu.training.majasdarbs8;

import java.util.Objects;

public class Car {
    private final String color;
    private final int year;
    private final String manufacturer;

    public Car(String color, int year, String manufacturer) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getYear() == car.getYear() && getColor().equals(car.getColor()) && getManufacturer().equals(car.getManufacturer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getYear(), getManufacturer());
    }
}
