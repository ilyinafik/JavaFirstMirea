package ru.mirea.task22.exercise1;

public class ReverseComplexFactory implements ComplexAbstractFactory {

    @Override
    public Complex create(double real, double img) {
        return new Complex(img, real);
    }
}
