package ru.mirea.task13.exercise3;

import ru.mirea.task12.exercise1.Student;
import ru.mirea.task13.exercise1.ListTest;

public class ArrayListTest extends ListTest<ArrayList<Student>> {

    public ArrayListTest() {
        super(ArrayList::new);
    }

    public static void main(String[] args) {
        new ArrayListTest().run();
    }
}
