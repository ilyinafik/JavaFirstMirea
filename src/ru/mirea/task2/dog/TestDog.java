package ru.mirea.task2.dog;

public class TestDog {

    public static void main(String[] args) {
        Dog dog1 = new Dog(10, "Dahsa");
        Dog dog2 = new Dog(10, "Dahsa2");
        Dog dog3 = new Dog("Даша");

        dog1.setAge(5);
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        dog1.intoHumanAge();
        dog2.intoHumanAge();
        dog3.intoHumanAge();
    }

}
