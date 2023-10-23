package org.course.hw4.Animals.Interface;


import java.util.ArrayList;
import java.util.List;


/*
 *   Реалізація через інтерфейс Тварина та підрахунок через статичнку статичні полі у класах
 */
public class Main {
    public static void main(String[] args) {
        List<Animals> animals = new ArrayList<>();


        animals.add(new Dog("Рекс", "Лабрадор", 3));
        animals.add(new Dog("Бобик", "Мопс", 2));
        animals.add(new Dog("Шарик", "Овчарка", 4));
        animals.add(new Cat("Мурзик", "Персидская", 5));
        animals.add(new Cat("Вася", "Британская", 4));
        animals.add(new Cat("Барсик", "Сиамская", 2));
        animals.add(new Cat("Абис", "Дворовая", 1));

        for (Animals animal: animals) {
            System.out.println();
            System.out.println("Имя: " + animal.getName());
            System.out.println("Порода: " + animal.getBreed());
            System.out.println("Возраст: " + animal.getAge());
            animal.run(300);
            animal.swim(5);
            System.out.println();
        }

        countAnimals(animals);
    }

    public static void countAnimals(List<Animals> animals) {
        System.out.println("Всего животных: " + animals.size());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего кошек: " + Cat.getCatCount());
    }
}