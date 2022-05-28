package lv.lu.training.eighthhomework;

public class SalariedEmployee extends Employee{

    double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String SSN, double salary) {
        super(firstName, lastName, SSN, salary);
        this.weeklySalary = salary;
    }


    @Override
    public double pay() {
        return this.weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return "salaried employee: Employee " + super.getFirstName() + " " + super.getLastName() + " " + super.getSSN() +
               " weekly salary: $" + super.getSalary() ;
    }

}
