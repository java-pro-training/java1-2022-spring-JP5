package lv.lu.training.majasdarbs8;

import java.util.Objects;

public class Truck extends Car{
    private long loadCapacity;

    public Truck(String color, int year, String manufacturer, long loadCapacity) {
        super(color, year, manufacturer);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Truck)) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return loadCapacity == truck.loadCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
    }
}
