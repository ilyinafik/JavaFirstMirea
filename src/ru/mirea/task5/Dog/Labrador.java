package ru.mirea.task5.Dog;

import ru.mirea.task5.Dog.Dog;

public class Labrador extends Dog {

    Labrador(String name, int age) {
        super(name, age);
    }

    void noise() {
        System.out.println("Labrador: gavk");
    }
}

