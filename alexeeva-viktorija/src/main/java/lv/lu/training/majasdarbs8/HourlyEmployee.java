package lv.lu.training.majasdarbs8;

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
}
