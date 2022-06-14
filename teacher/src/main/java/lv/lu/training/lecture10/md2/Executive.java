package lv.lu.training.lecture10.md2;

public class Executive extends Employee {

    private double bonus;

    public Executive(String firstName, String lastName, String socialSecurityNumber, double salary) {
        super(firstName, lastName, socialSecurityNumber, salary);
    }

    public void awardBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double pay() {
        double salary = super.pay() + getBonus();
        awardBonus(0);
        return salary;
    }

    @Override
    public String toString() {
        return "Executive{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", socialSecurityNumber='" + getSocialSecurityNumber() + '\'' +
                ", pay=" + pay() +
                ", bonus=" + bonus +
                ", pay=" + pay() +
                '}';
    }
}
