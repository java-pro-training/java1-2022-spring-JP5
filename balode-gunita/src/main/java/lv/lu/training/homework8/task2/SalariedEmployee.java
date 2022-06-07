package lv.lu.training.homework8.task2;

public class SalariedEmployee extends Employee {

    private double weeklySalary;

    //Konstruktors
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    //Getter and Setter
    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    //Aizvietot (override) metodi pay
    @Override
    public double pay() {
        return this.weeklySalary;
    }

    //toString
    @Override
    public String toString() {
        return "Salaried Employee: {" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", socialSecurityNumber='" + getSocialSecurityNumber() + '\'' +
                ", weeklySalary=" + weeklySalary +
                '}';
    }
}
