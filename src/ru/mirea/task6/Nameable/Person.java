package ru.mirea.task6.Nameable;

public class Person implements Nameable {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Person(String name) {
        this.name = name;
    }
}