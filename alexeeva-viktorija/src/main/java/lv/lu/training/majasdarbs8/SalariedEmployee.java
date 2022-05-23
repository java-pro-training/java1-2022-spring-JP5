package lv.lu.training.majasdarbs8;

import java.util.Objects;

public class SalariedEmployee extends Employee {

    protected double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double pay(){
        return weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "weeklySalary=" + weeklySalary +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SalariedEmployee)) return false;
        if (!super.equals(o)) return false;
        SalariedEmployee that = (SalariedEmployee) o;
        return Double.compare(that.getWeeklySalary(), getWeeklySalary()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getWeeklySalary());
    }
}
