package lv.lu.training.majasdarbs8;

import java.util.Objects;

public class Buss extends Car implements Passenger{
    public final int passengerSeatCount;

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
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Buss)) return false;
        if (!super.equals(o)) return false;
        Buss buss = (Buss) o;
        return passengerSeatCount == buss.passengerSeatCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengerSeatCount);
    }
}
