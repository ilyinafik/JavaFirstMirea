package ru.mirea.task3.Human;

import java.util.LinkedList;
import java.util.List;

public class HumanTest {

    public static void main(String[] args) {
        List<BodyPart> bodyPartList = new LinkedList<>() {{
            add(new Head());
            add(new Torso());
            add(new Hand());
            add(new Hand());
            add(new Leg());
            add(new Leg());
        }};

        Human human = new Human();
        for (BodyPart bodyPart : human.getBodyParts()) {
            bodyPartList.remove(bodyPart);
        }
        System.out.println(bodyPartList.isEmpty());
    }
}
