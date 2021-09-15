package ru.mirea.task2.dog;

public class Dog {

    private int age;
    private String name;

    public Dog(int age1, String name1) {
        age = age1;
        name = name1;

    }

    public Dog(int age1) {
        age = age1;
        name = "Bob";
    }

    public Dog(String name1) {
        name = name1;
    }

    public Dog() {
        name = "Bob";
        age = 0;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return name + ", age " + age;
    }

    public void intoHumanAge(){
        System.out.println(name + "'s age in human years is " + age * 7 + " years");
    }

    void gawk() {
        System.out.println("GAVK GAVK");
    }

}