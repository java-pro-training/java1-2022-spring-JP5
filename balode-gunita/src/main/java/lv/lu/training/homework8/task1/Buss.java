package lv.lu.training.homework8.task1;

import java.util.Objects;

public class Buss extends Car implements Passenger {

    private String transmission;    //Automatic or Manual
    private final int passengerSeatCount;

    //Konstruktors
    public Buss(String color, int year, String manufacturer, String transmission, int passengerSeatCount) {
        super(color, year, manufacturer);
        this.transmission = transmission;
        this.passengerSeatCount = passengerSeatCount;
    }

    @Override
    public int passengerSeatCount() {
        return this.passengerSeatCount;
    }

    //Parrakstit toString metodi
    @Override
    public String toString() {
        return "Buss{" +
                "transmission='" + transmission + '\'' +
                ", passengerSeatCount=" + passengerSeatCount +
                ", color='" + getColor() + '\'' +
                ", year=" + getYear() +
                ", manufacturer='" + getManufacturer() + '\'' +
                '}';
    }

    //Parrakstit equals metodi
    // GB: Kadel seit neielasas ari dati no Car klases (color, year, manufacturer)?
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Buss)) return false;
        if (!super.equals(o)) return false;
        Buss buss = (Buss) o;
        return passengerSeatCount == buss.passengerSeatCount && Objects.equals(transmission, buss.transmission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), transmission, passengerSeatCount);
    }
}
