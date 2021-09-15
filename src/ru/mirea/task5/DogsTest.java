package ru.mirea.task5;

public class DogsTest {

    public static void main(String[] args) {
        Dog dog1 = new BullDog("Tifany", 3);
        Dog dog2 = new Husky("Alberto", 7);
        Dog dog3 = new Labrador("Jovani", 4);
        printDogInfo(dog1);
        printDogInfo(dog2);
        printDogInfo(dog3);
    }

    static void printDogInfo(Dog dog) {
        System.out.println("name: " + dog.getName() + " age: " + dog.getAge());
        dog.noise();
    }

}