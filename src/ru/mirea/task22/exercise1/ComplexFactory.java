package ru.mirea.task22.exercise1;

public class ComplexFactory implements ComplexAbstractFactory {

    @Override
    public Complex create(double real, double img) {
        return new Complex(real, img);
    }

}