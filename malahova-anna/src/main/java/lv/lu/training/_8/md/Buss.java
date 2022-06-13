package lv.lu.training._8.md;

import java.util.Objects;

public class Buss extends Car implements Passenger {

    private final int passengerSeatCount;

    public Buss(String color, int year, String manufacturer, int passengerSeatCount) {
        super(color, year, manufacturer);
        this.passengerSeatCount = passengerSeatCount;
    }

    public int getYear() {
        return super.getYear();
    }

    @Override
    public int passengerSeatCount() {
        return this.passengerSeatCount;
    }

    public String toString() {
        return "Buss{" +
                "passangerSeatCount=" + passengerSeatCount() +
                ", color='" + getColor() + '\'' +
                ", year=" + getYear() +
                ", manufacturer='" + getManufacturer() + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Buss buss = (Buss) o;
        return passengerSeatCount == buss.passengerSeatCount
                && getColor().equals(buss.getColor())
                && getYear() == buss.getYear()
                && getManufacturer().equals(buss.getManufacturer());
    }

    public int hashCode() {
        return Objects.hash(passengerSeatCount);
    }
}
