package lv.lu.training.homework4;

import java.util.Scanner;

public class GratestOfTree {

    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);

        System.out.println("Pirmais skaitlis");
        int x1 = scaner.nextInt();
        System.out.println("Otrias skaitlis");
        int x2 = scaner.nextInt();
        System.out.println("Tresais skaitlis");
        int x3 = scaner.nextInt();

        if (x1 > x2 && x1 > x3)
        {
            System.out.println(" Lielakais skaitlis!");

        } else if (x2 > x3 && x2 > x1) {
            System.out.println("Lielakais Skailtis!");
        } else {
            System.out.println("Lielakais skitlis");
        }
    }
}