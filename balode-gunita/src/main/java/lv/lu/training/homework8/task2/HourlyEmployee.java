package lv.lu.training.homework8.task2;

public class HourlyEmployee extends Employee {

    private int hoursWorked;
    private double payRate;

    //Konstruktors
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double payRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.payRate = payRate;
    }

    void addHours (int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //Getter and Setter
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    //Aizvietot (override) metodi pay
    @Override
    public double pay() {
        return getHoursWorked() * getPayRate();
    }

    //toString
    @Override
    public String toString() {
        return "Hourly Employee: {" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", socialSecurityNumber='" + getSocialSecurityNumber() + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", payRate=" + payRate +
                '}';
    }
}
