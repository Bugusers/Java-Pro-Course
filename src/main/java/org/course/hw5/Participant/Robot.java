package org.course.hw5.Participant;

public class Robot extends Participant {
    private final int MAX_DISTANCE_RUN = 100;
    private final int MAX_HEIGHT_JUMP = 4;


    public Robot(String name) {
        super(name);
    }

    @Override
    public boolean run(int distance) {
        if (distance <= MAX_DISTANCE_RUN) {
            System.out.println("Robot " + name + " has run " + distance + " meters!");
            return true;
        }

        System.out.println("Robot " + name + " couldn't complete this distance!");
        return false;
    }

    @Override
    public boolean jump(int height){
        if (height <= MAX_HEIGHT_JUMP) {
            System.out.println("Robot " + name + " jumped on " + height + " meters!");
            return true;
        }

        System.out.println("Robot " + name + " couldn't jumped to this height!");
        return false;
    }

}