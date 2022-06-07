package lv.lu.training.lecture10.md1;

import java.util.Objects;

public class Buss extends Car implements Passenger {

    private final int passengerSeatCount;

    public Buss(String color, int year, String manufacturer, int passengerSeatCount) {
        super(color, year, manufacturer);
        this.passengerSeatCount = passengerSeatCount;
    }

    @Override
    public int passengerSeatCount() {
        return this.passengerSeatCount;
    }

    @Override
    public String toString() {
        return "Buss{" +
                "passengerSeatCount=" + passengerSeatCount +
                ", color='" + getColor() + '\'' +
                ", year=" + getYear() +
                ", manufacturer='" + getManufacturer() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Buss)) return false;
        Buss buss = (Buss) o;
        return passengerSeatCount == buss.passengerSeatCount
                && getColor().equals(buss.getColor())
                && getYear() == buss.getYear()
                && getManufacturer().equals(buss.getManufacturer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengerSeatCount);
    }
}
