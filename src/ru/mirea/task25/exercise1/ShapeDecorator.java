package ru.mirea.task25.exercise1;

public abstract class ShapeDecorator implements Shape {

    public final Shape shape;

    protected ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
    }

}
