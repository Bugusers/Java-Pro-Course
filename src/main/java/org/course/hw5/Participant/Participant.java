package org.course.hw5.Participant;

import org.course.hw5.Obstacle.Obstacle;


public abstract class Participant {
    protected String name;

    public Participant(String name) {
        this.name = name;
    }

    public abstract boolean run(int distance);
    public abstract boolean jump(int height);
    public String getName() {
        return name;
    }
}