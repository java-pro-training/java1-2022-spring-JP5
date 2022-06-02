package lv.lu.training.homework8.task2;

//Abstrakta klase, jo nav domata tiesai izmantosanai, bet gan specializetu apaksklasu veidosanai.
//Saja klase ievieto kopejas logikas kodu un apaksklases tikai specializetu kodu.

public abstract class Employee implements Payable {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double salary;

    //Konstruktors String laukiem
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //Konstruktors visiem laukiem
    public Employee(String firstName, String lastName, String socialSecurityNumber, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.salary = salary;
    }

    //Getter and Setter visiem laukiem
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
