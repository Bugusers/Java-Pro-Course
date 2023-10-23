package org.course.hw4.Animals.Interface;

public class Dog implements Animals {
    private String name;
    private String breed;
    private int age;

    private static int dogCount = 0;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;

        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public int getAge() {
        return age;
    }
}
