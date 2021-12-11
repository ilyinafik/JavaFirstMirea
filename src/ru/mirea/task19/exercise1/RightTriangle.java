package ru.mirea.task19.exercise1;

public class RightTriangle {

    private int angle1;
    private int angle2;

    public RightTriangle(int angle1, int angle2) {
        if (angle1 + angle2 != 90) {
            throw new IllegalArgumentException("Sum of angles should be equal to 90");
        }
        this.angle1 = angle1;
        this.angle2 = angle2;
    }

    public int getAngle1() {
        return angle1;
    }

    public int getAngle2() {
        return angle2;
    }

    @Override
    public String toString() {
        return "RightTriangle{" +
                "angle1=" + angle1 +
                ", angle2=" + angle2 +
                '}';
    }
}
