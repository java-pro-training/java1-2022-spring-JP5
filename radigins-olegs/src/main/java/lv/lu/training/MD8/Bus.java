package lv.lu.training.MD8;

public class Bus extends Car implements Passenger {
    private final int passengerSeatCount;
    public Bus(String color, int year, String manufacturer, int
            passengerSeatCount) {
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
                "color='" + getColor() + '\'' +
                ", year='" + getYear() + '\'' +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", passengerSeatCount=" + passengerSeatCount +
                "} ";
    }
    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Bus buss = (Bus) that;
        return passengerSeatCount == buss.passengerSeatCount
                && getColor().equals(buss.getColor())
                && getYear() == buss.getYear()
                && getManufacturer().equals(buss.getManufacturer());
    }

}
