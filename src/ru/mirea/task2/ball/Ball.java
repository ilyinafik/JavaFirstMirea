package ru.mirea.task2.ball;

public class Ball {

    private String color = "white";
    private double radius = 1;

    public Ball() {
    }

    public Ball(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public Ball(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }
}