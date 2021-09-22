package ru.mirea.task3.Human;

import java.util.Objects;

public abstract class BodyPart {

    public abstract String getName();

    @Override
    public String toString() {
        return "I'm part of" + getName() + "!";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BodyPart bodyPart = (BodyPart) o;
        return Objects.equals(getName(), bodyPart.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
