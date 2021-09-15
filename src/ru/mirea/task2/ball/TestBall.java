package ru.mirea.task2.ball;

public class TestBall {

    public static void main(String[] args) {
        Ball ball1 = new Ball();
        Ball ball2 = new Ball("red", 10.5);
        Ball ball3 = new Ball("blue");
        Ball ball4 = new Ball("green");

        ball3.setRadius(5);
        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
        System.out.println(ball4);
    }

}
