package lv.lu.training.tenthhomework;

import java.util.Scanner;

public class CreateUser {

    public static void main(String[] args) {

        String name;
        String surename;
        int age;
        Scanner scanner = new Scanner(System.in);
        UserValidator validator = new UserValidator();
        boolean dataValid = false;

        while (!(dataValid)) {
        System.out.println("Please enter user name:");
        name = scanner.next();
        System.out.println("Please enter user surename:");
        surename = scanner.next();
        System.out.println("Please enter user age:");
        while(!scanner.hasNextInt() ) {
            System.out.println("Error - input mus be integer! Please enter user age:\"");
            scanner.next();
        }
        age = scanner.nextInt();

        try {
            validator.validate(new User(name, surename, age));
            dataValid =true;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        }

    }
}
