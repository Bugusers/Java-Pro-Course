package org.course.hw4.Animals.AbstractClass;

import java.util.ArrayList;
import java.util.List;


/*
*   Реалізація через абстрактний клас Тварина та підрахунок через статичнку функцію
*/

public class Main {
    public static void main(String[] args) {
        List<Animals> animals = new ArrayList<>();
        animals.add(new Dog("Юки", "Джек-рассел Терьер", 1));
        animals.add(new Dog("Рекс", "Лабрадор", 3));
        animals.add(new Dog("Бобик", "Мопс", 2));
        animals.add(new Dog("Шарик", "Овчарка", 4));
        animals.add(new Cat("Мурзик", "Персидская", 5));
        animals.add(new Cat("Вася", "Британская", 4));
        animals.add(new Cat("Барсик", "Сиамская", 2));


        for (Animals animal: animals) {
            System.out.println();
            System.out.println("Имя: " + animal.getName());
            System.out.println("Порода: " + animal.getBreed());
            System.out.println("Возраст: " + animal.getAge());
            animal.run(100);
            animal.swim(12);
            System.out.println();
        }

        countAnimals(animals);
    }

    public static void countAnimals(List<Animals> animals) {
        int dogCount = 0;
        int catCount = 0;

        for (Animals animal : animals) {
            if (animal instanceof Dog) {
                dogCount++;
            }
            if (animal instanceof Cat) {
                catCount++;
            }
        }

        int totalAnimalCount = animals.size();

        System.out.println("Всего животных: " + totalAnimalCount);
        System.out.println("Всего собак: " + dogCount);
        System.out.println("Всего кошек: " + catCount);
    }
}