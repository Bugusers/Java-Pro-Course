package org.course.hw4.Animals.AbstractClass;

public class Dog extends Animals {
    public Dog(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(name + " пробіг " + distance + " м");
            return;
        }

        System.out.println(name + " не може пробігти більше 500 м");
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(name + " проплив " + distance + " м");
            return;
        }

        System.out.println(name + " не може пропливти більше 10 м");
    }

}
