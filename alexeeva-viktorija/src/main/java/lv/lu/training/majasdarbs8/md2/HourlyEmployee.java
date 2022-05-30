package lv.lu.training.majasdarbs8.md2;

import java.util.Objects;

public class HourlyEmployee extends Employee {

    protected int hoursWorked;
    protected double payRate;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, int hoursWorked, double payRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    @Override
    public double pay(){
        return hoursWorked*payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hoursWorked=" + hoursWorked +
                ", payRate=" + payRate +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HourlyEmployee)) return false;
        if (!super.equals(o)) return false;
        HourlyEmployee that = (HourlyEmployee) o;
        return getHoursWorked() == that.getHoursWorked() && Double.compare(that.getPayRate(), getPayRate()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getHoursWorked(), getPayRate());
    }
}
