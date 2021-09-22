package ru.mirea.task5.Dog;

import ru.mirea.task5.Dog.Dog;

public class Husky extends Dog {

    Husky(String name, int age) {
        super(name, age);
    }

    void noise() {
        System.out.println("Husky: gavk");
    }
}