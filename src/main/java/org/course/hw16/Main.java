package org.course.hw16;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = toList(intArray);
        System.out.println(intList);

        String[] strArray = {"apple", "banana", "orange"};
        List<String> strList = toList(strArray);
        System.out.println(strList);
    }

    public static <T> List<T> toList(T[] array) {
        List<T> list = new ArrayList<T>();

        for (T element : array) {
            list.add(element);
        }

        return list;
    }

}
