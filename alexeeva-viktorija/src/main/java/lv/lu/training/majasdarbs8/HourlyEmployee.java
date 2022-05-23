package lv.lu.training.majasdarbs8;

public class HourlyEmployee extends Employee {

    int hoursWorked;
    double payRate;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double salary, int hoursWorked) {
        super(firstName, lastName, socialSecurityNumber, salary);
        this.hoursWorked = hoursWorked;
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
