package lv.lu.training.eighthhomework;

public class HourlyEmployee extends Employee{

    int hoursWorked;
    double payRate;

    public HourlyEmployee(String firstName, String lastName, String SSN, double payRate) {
        super(firstName, lastName, SSN);
        this.payRate = payRate;
    }

    @Override
    public double pay(){
        double payAmount = this.hoursWorked * this.payRate;
        this.hoursWorked = 0;
        return payAmount;
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

    public void addHours(int hours) {
        this.hoursWorked += hours;
    }

    @Override
    public String toString() {
        return "hourly employee: Employee " + super.getFirstName() + " " + super.getLastName() + " " + super.getSSN() +
                " rate: $" + this.payRate +
                " hours worked: " + this.hoursWorked ;
    }

}
