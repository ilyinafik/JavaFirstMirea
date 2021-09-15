package ru.mirea.task5;

public class BullDog extends Dog {

    BullDog(String name, int age) {
        super(name, age);
    }

    void noise() {
        System.out.println("BullDog: gavk");
    }
}
