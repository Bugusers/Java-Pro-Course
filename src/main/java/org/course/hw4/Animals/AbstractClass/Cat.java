package org.course.hw4.Animals.AbstractClass;


public class Cat extends Animals {
    public Cat(String name, String breed, int age) {
        super(name, breed, age);
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

}
