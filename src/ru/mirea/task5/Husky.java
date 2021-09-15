package ru.mirea.task5;

public class Husky extends Dog {

    Husky(String name, int age) {
        super(name, age);
    }

    void noise() {
        System.out.println("Husky: gavk");
    }
}