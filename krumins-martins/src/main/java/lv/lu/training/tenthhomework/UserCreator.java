package lv.lu.training.tenthhomework;

public class UserCreator {

    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        /* notiek tas, ka programm apstājas pie pirmā izņēmuma, jo tas netiek "noķerts" */
        validator.validate(new User("Martins", "Ceske", 37));
        validator.validate(new User("Martins", "Ceske", -1));
        validator.validate(new User("MartinsMartinsMartins", "Ceske", 37));

    }
}
