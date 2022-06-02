package lv.lu.training.homework8.task1;

import java.util.Objects;

public class Car {

    //Kopigas ipasibas
    private final String color;
    private final int year;
    private final String manufacturer;

    //Konstruktors
    public Car(String color, int year, String manufacturer) {
        this.color = color;
        this.year = year;
        this.manufacturer = manufacturer;
    }

    //Getter metodes pievienosana
    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    //Parrakstit toString metodi
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", year=" + year +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    //Parrakstit equals metodi
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(color, car.color) && Objects.equals(manufacturer, car.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, year, manufacturer);
    }
}