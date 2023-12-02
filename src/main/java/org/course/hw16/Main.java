package org.course.hw16;


import org.course.hw16.box.Box;
import org.course.hw16.fruits.Apple;
import org.course.hw16.fruits.Orange;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Task 1
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = toList(intArray);
        System.out.println(intList);

        String[] strArray = {"apple", "banana", "orange"};
        List<String> strList = toList(strArray);
        System.out.println(strList);

        // Task 2
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Orange orange1 = new Orange();


        Box<Apple> box1 = new Box();
        Box<Orange> box2 = new Box();
        Box<Orange> box3 = new Box();


        box1.addAll(List.of(apple1, apple2, new Apple()));
        box2.addAll(List.of(orange1, new Orange()));
        box3.addAll(List.of(orange1, new Orange()));
        box3.add(new Orange());


        System.out.println("Weight of Box 1: " + box1.getWeight());
        System.out.println("Weight of Box 2: " + box2.getWeight());
        System.out.println("Weight of Box 3: " + box3.getWeight());


        System.out.println("Are Box 1 and Box 2 equal? " + box1.compare(box2));
        System.out.println("Are Box 1 and Box 3 equal? " + box1.compare(box3));


        System.out.println("Merging Box 1 and Box 3...");
        box1.merge(box3);

        System.out.println("Merging Box 2 and Box 3...");
        box2.merge(box3);
        System.out.println("Weight of Box 2 after merge: " + box2.getWeight());
        System.out.println("Weight of Box 3 after merge: " + box3.getWeight());
    }

    public static <T> List<T> toList(T[] array) {
        List<T> list = new ArrayList<T>();

        for (T element : array) {
            list.add(element);
        }

        return list;
    }

}
