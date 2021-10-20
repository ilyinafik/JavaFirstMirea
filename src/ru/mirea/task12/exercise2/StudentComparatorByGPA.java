package ru.mirea.task12.exercise2;

import ru.mirea.task12.exercise1.Student;

import java.util.Comparator;

public class StudentComparatorByGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.getGpa(), o1.getGpa());
    }

}
