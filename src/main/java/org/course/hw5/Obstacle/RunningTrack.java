package org.course.hw5.Obstacle;

import org.course.hw5.Participant.Participant;

public class RunningTrack implements Obstacle {
    private int distance;

    public RunningTrack(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public boolean overCome(Participant participant) {
        return participant.run(distance);
    }
}
