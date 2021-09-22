package ru.mirea.task3.Human;

public class Human {

    private BodyPart[] bodyParts = {
            new Head(),
            new Torso(),
            new Hand(), new Hand(),
            new Leg(), new Leg() };

    public void setBodyParts(BodyPart[] bodyParts) {
        this.bodyParts = bodyParts;
    }

    public BodyPart[] getBodyParts() {
        return bodyParts;
    }
}
