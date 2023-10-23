package org.course.hw4.Animals.AbstractClass;

public abstract class Animals {
    protected String name;
    protected String breed;
    protected int age;


    public Animals(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
