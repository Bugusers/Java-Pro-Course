package org.course.hw5.Obstacle;

import org.course.hw5.Participant.Participant;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean overCome(Participant participant) {
        return participant.jump(height);
    }
}