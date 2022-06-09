package lv.lu.training.majasdarbs10;


import java.util.Scanner;

public class UserCreator {
    public static void main(String[] args) throws ValidationException {
        UserValidator validator = new UserValidator();
        Scanner scanner = new Scanner(System.in);
        boolean correctInfo = true;
        while (correctInfo) {

            System.out.println("Please enter name: ");
            String name = scanner.nextLine();
            System.out.println("Please enter surname: ");
            String surname = scanner.nextLine();
            System.out.println("Please enter age: ");
            int age = scanner.nextInt();
            validator.validate(new User(name, surname, age));
        }
        System.out.println("incorrect data, pls try again");

//        version1:
//        validator.validate(new User("Anna","Upe", 35));
//        validator.validate(new User("John","Smith", 125));
//        validator.validate(new User("Kristaps-Peteris","Ozols", 17));
//        validator.validate(new User("Maris","Lucavsalis-Krumis", 65));


    }
}
