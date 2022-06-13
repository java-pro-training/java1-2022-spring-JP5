package lv.lu.training.lecture10.md2;

public class HourlyEmployee extends Employee {

    private int hoursWorked;
    private double payRate;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double payRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.payRate = payRate;
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

    public void addHours(int hours){
        this.hoursWorked += hours;
    }

    @Override
    public double pay() {
        double sum = hoursWorked * payRate;
        hoursWorked = 0;
        return sum;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", socialSecurityNumber='" + getSocialSecurityNumber() + '\'' +
                ", pay=" + pay() +
                ", hoursWorked=" + hoursWorked +
                ", payRate=" + payRate +
                ", pay=" + pay() +
                '}';
    }
}
