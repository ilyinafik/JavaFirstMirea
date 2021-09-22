package ru.mirea.task5.Dish;

public abstract class Dish {

    public abstract String getName();

    public abstract String getSound();

    public void makeSound() {
        System.out.println(getSound());
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name=" + getName() +
                ", sound=" + getSound() +
                "}";
    }
}
