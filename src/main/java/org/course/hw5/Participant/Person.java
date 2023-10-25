package org.course.hw5.Participant;


public class Person extends Participant {
    private final int MAX_DISTANCE_RUN = 170;
    private final int MAX_HEIGHT_JUMP = 2;


    public Person(String name) {
        super(name);
    }

    @Override
    public boolean run(int distance) {
        if (distance <= MAX_DISTANCE_RUN) {
            System.out.println(name + " has run " + distance + " meters!");
            return true;
        }

        System.out.println(name + " couldn't complete this distance!");
        return false;
    }

    public boolean jump(int height){
        if (height <= MAX_HEIGHT_JUMP) {
            System.out.println(name + " jumped on " + height + " meters!");
            return true;
        }

        System.out.println(name + " couldn't jumped to this height!");
        return false;
    }

}
