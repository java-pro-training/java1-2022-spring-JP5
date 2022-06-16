package lv.lu.training._8.md_2;

public class Executive extends Employee{

    private double bonus;

    public void awardBonus(double bonus){
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public Executive(String firstName, String lastName, String socialSecurityNumber, double bonus) {
        super(firstName, lastName, socialSecurityNumber);
        this.bonus = bonus;
    }

    @Override
    public double pay() {
        double salary = super.pay() + getBonus();
        awardBonus(0);
        return salary;
    }

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
