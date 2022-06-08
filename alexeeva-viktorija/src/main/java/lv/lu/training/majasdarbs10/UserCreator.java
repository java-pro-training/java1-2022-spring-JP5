package lv.lu.training.majasdarbs10;

public class UserCreator {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        validator.validate(new User("Anna","Upe", 35));
        validator.validate(new User("John","Smith", 125));
        validator.validate(new User("Kristaps-Peteris","Ozols", 17));
        validator.validate(new User("Maris","Lucavsalis-Krumis", 65));
    }
}
