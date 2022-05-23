package lv.lu.training.majasdarbs8;

public class Executive extends Employee {

    double bonus;

    public Executive(String firstName, String lastName, String socialSecurityNumber, double salary, double bonus) {
        super(firstName, lastName, socialSecurityNumber, salary);
        this.bonus = bonus;
    }

    public double awardBonus() {
        return bonus;
    }

    @Override
    public double pay() {
        return salary+awardBonus();
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
