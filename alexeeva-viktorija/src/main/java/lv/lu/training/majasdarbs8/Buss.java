package lv.lu.training.majasdarbs8;

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
}
