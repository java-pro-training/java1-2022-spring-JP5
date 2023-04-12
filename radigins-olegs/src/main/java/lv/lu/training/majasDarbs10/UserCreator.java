package lv.lu.training.majasDarbs10;

import java.util.Scanner;

public class UserCreator {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        do {
            String name = getName();
            String surname = getSurname();
            int age = getAge();
            validator.validate(new User(name, surname, age));
        }while (!validator.errors.isEmpty());



    }


    private static int getAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter age: ");
        int age = scanner.nextInt();
        return age;
    }

    private static String getSurname() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter surname: ");
        String surname = scanner.nextLine();
        return surname;
    }

    private static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter name: ");
        String name = scanner.nextLine();
        return name;
    }
}

