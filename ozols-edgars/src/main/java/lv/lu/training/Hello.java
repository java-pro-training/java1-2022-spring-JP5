package lv.lu.training;

import java.util.SortedMap;

public class Hello {

    public static void main(String[] args) {

            Book newBook = new Book("Harijs Poters", 5, "Dzoanna Ketlina Roulinga");
            Book differntBook = new Book("Mazais Princis", 10,"Antuāns de Sent-Ekziperi");


        System.out.println(newBook.getName());
        System.out.println(newBook.getPages());
        System.out.println(newBook.getAuthor());

        System.out.println(differntBook.getName());
        System.out.println(differntBook.getPages());
        System.out.println(differntBook.getAuthor());

    }
}
