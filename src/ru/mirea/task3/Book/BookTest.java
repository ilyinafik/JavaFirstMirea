package ru.mirea.task3.Book;

import ru.mirea.task3.Book.Book;

public class BookTest {

    public static void main(String[] args) {
        Book book =
                new Book("Sun Tzu", 'M', "The Art of War", -500, null);

        System.out.println(book.getAuthor());
        System.out.println(book.getGender());
        System.out.println(book.getName());
        System.out.println(book.getYear());
        System.out.println(book.getMail());
    }

}