package org.course.hw5;

import org.course.hw5.Obstacle.Obstacle;
import org.course.hw5.Obstacle.RunningTrack;
import org.course.hw5.Obstacle.Wall;
import org.course.hw5.Participant.Cat;
import org.course.hw5.Participant.Participant;
import org.course.hw5.Participant.Person;
import org.course.hw5.Participant.Robot;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = new Participant[] {
                new Person("Alice"),
                new Cat("Whiskers"),
                new Robot("Robo"),
                new Robot("T-1000")
        };

        Obstacle[] obstacles = new Obstacle[] {
                new RunningTrack(50),
                new Wall(1),
                new RunningTrack(200),
                new Wall(4)
        };

        for (Participant participant : participants) {
            boolean isParticipantStillInGame = true;
            int countOfObstacle = 0;

            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overCome(participant)) {
                    isParticipantStillInGame = false;
                    break;
                }

                countOfObstacle++;
            }
            if (isParticipantStillInGame) {
                System.out.println("Participant[" + participant.getName() + "] completes all obstacles!");
            } else {
                System.out.println("Participant[" + participant.getName() + "] completes " + countOfObstacle + " obstacles.");
            }
        }
    }
}