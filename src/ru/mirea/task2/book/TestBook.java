package ru.mirea.task2.book;

public class TestBook {

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book(2020);
        Book book3 = new Book("Cat", 2007);

        String title = book1.getTitle();
        System.out.println(title);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }

}
