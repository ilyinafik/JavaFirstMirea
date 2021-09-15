package ru.mirea.task2.book;

public class Book {

    private String title = "No title";
    private int date = 0;

    public Book() {
    }

    public Book(String title, int date) {
        this.title = title;
        this.date = date;
    }

    public Book(String title) {
        this.title = title;
    }

    public Book(int date) {
        this.date = date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public int getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Book" +
                " title = '" + title + '\'' +
                ", date = " + date;
    }
}
