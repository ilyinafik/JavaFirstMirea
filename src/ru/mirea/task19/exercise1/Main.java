package ru.mirea.task19.exercise1;

public class Main {


    public static void main(String[] args) {
        try {
            RightTriangle rightTriangle = new RightTriangle(20, 70);
            System.out.println(rightTriangle);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        try {
            RightTriangle rightTriangle = new RightTriangle(30, 70);
            System.out.println(rightTriangle);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

}
