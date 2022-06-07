package lv.lu.training.homework8.task1;

import java.util.Objects;

public class Truck extends Car {

    private long loadCapacity;
    private String typeOfTruck;     //Tanker; Grader; Bulldozer; Crane etc.

    //Konstruktors
    public Truck(String color, int year, String manufacturer, long loadCapacity, String typeOfTruck) {
        super(color, year, manufacturer);
        this.loadCapacity = loadCapacity;
        this.typeOfTruck = typeOfTruck;
    }

    //Parrakstit toString metodi
    @Override
    public String toString() {
        return "Truck{" +
                "color='" + getColor() + '\'' +
                ", year=" + getYear() +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", loadCapacity=" + loadCapacity +
                ", typeOfTruck='" + typeOfTruck + '\'' +
                '}';
    }

    //Parrakstit equals metodi
    // GB: Kadel seit neielasas ari dati no Car klases (color, year, manufacturer)?
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Truck)) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return loadCapacity == truck.loadCapacity && Objects.equals(typeOfTruck, truck.typeOfTruck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity, typeOfTruck);
    }
}
