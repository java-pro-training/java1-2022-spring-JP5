package lv.lu.training;

public class Book {

    private String name;
    private int pages;
    private String author;

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    public Book(String name, int pages, String author ) {
        this.pages = pages;
        this.name = name;
        this.author = author;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
