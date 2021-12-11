package ru.mirea.task23.exercise1;

import java.util.Objects;

public class ObjectExample {

    private final int value;

    public ObjectExample(int value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
