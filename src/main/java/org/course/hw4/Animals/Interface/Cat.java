package org.course.hw4.Animals.Interface;


public class Cat implements Animals {
    private String name;
    private String breed;
    private int age;

    private static int catCount = 0;

    public Cat(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;

        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }


    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробіг " + distance + " м");
            return;
        }

        System.out.println(name + " не може пробігти більше 200 м");
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не вміє плавати!!!");
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
