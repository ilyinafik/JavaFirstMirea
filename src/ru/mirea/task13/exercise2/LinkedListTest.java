package ru.mirea.task13.exercise2;

import ru.mirea.task12.exercise1.Student;
import ru.mirea.task13.exercise1.ListTest;

import java.util.LinkedList;

public class LinkedListTest extends ListTest<LinkedList<Student>> {

    public LinkedListTest() {
        super(LinkedList::new);
    }

    public static void main(String[] args) {
        new LinkedListTest().run();
    }
}
