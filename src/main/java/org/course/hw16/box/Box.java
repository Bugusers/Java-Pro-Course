package org.course.hw16.box;


import org.course.hw16.fruits.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> implements Comparable<Box>{
    private final List<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void add(T value) {
        if (fruits.isEmpty() || value.getClass() == fruits.get(0).getClass()) {
            fruits.add(value);
            return;
        }

        System.out.println("Неприпустима комбінація фруктів у коробці.");
    }

    public void addAll(List<T> fruitsToAdd) {
        for (T fruit : fruitsToAdd) {
            add(fruit);
        }
    }
    public float getWeight() {
        return fruits.stream()
                .map(fruit -> fruit.getWeight())
                .reduce(0.0f, Float::sum);
    }

    public boolean compare(Box box) {
        return this.compareTo(box) == 0;
    }

    public void merge(Box otherBox) {
        if (this.fruits.isEmpty() || otherBox.fruits.isEmpty() ||
                this.fruits.get(0).getClass() == otherBox.fruits.get(0).getClass()) {
            this.fruits.addAll(otherBox.fruits);
            otherBox.fruits.clear();

            return;
        }

        System.out.println("Неприпустима комбінація фруктів для злиття коробок.");
    }

    @Override
    public int compareTo(Box otherBox) {
        return Float.compare(this.getWeight(), otherBox.getWeight());
    }
}
