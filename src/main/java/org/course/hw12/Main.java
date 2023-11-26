package org.course.hw12;


import org.course.hw12.phonebook.Note;
import org.course.hw12.phonebook.PhoneBook;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Task 1
        List<String> wordList = Arrays.asList("apple", "orange", "banana", "apple", "grape", "apple", "banana");

        System.out.println("Кількість входжень слова 'apple': " + countOccurance(wordList, "apple"));


        // Task 2
        Integer[] intArr = {1, 2, 3};
        List<Integer> intList = toList(intArr);
        System.out.println("Список цілих чисел: " + intList);


        // Task3
        List<Integer> numbers = List.of(1, 2, 9, 21, 9, 3, 2, 4, 5, 6, 4, 7, 8, 9, 1, 3, 10);
        List<Integer> uniqueNumbers = findUnique(numbers);

        System.out.println("Оригінальний список: " + numbers);
        System.out.println("Список з унікальними числами: " + uniqueNumbers);


        // Task4 and task 5
        List<String> wordsList = List.of("apple", "orange", "banana", "apple", "grape", "apple", "banana", "orange", "orange", "banana");
        calcOccurrence(wordsList);
        System.out.println(findOccurrence(wordsList));



        // Task 6
        PhoneBook phoneBook = new PhoneBook();


        Note ivanNote = new Note("Іван", "123-456-789");
        ivanNote.addPhoneNumber("987-654-321");
        phoneBook.add(ivanNote);

        phoneBook.add(new Note("Марія", "111-222-333"));
        phoneBook.add(new Note("Іван", "111-222-333"));

        String searchName = "Іван";


        Note foundNote = phoneBook.find(searchName);
        if (foundNote != null) {
            System.out.println("Знайдено: " + foundNote.getName() + " - " + foundNote.getPhoneNumbers());
        } else {
            System.out.println("Запис не знайдено для ім'я " + searchName);
        }



        List<Note> foundNotes = phoneBook.findAll(searchName);
        if (!foundNotes.isEmpty()) {
            System.out.println("Знайдено записів для ім'я " + searchName + ":");
            for (Note note : foundNotes) {
                System.out.println(note.getName() + " - " + note.getPhoneNumbers());
            }
        } else {
            System.out.println("Записів не знайдено для ім'я " + searchName);
        }
    }

    public static int countOccurance(List<String> wordList, String targetWord) {
        return (int) wordList.stream()
                .filter(word -> word.equals(targetWord))
                .count();
    }

    public static <T> List<T> toList(T[] arr) {
        List<T> list = new ArrayList<>();

        for(T element : arr) {
            list.add(element);
        }

        return list;
    }

    public static List<Integer> findUnique(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static void calcOccurrence(List<String> wordList) {
        List<String> uniqueWords = new ArrayList<>();
        List<Integer> wordCounts = new ArrayList<>();


        for (String word : wordList) {
            int index = uniqueWords.indexOf(word);

            if (index == -1) {
                uniqueWords.add(word);
                wordCounts.add(1);
            } else {
                int count = wordCounts.get(index);
                wordCounts.set(index, count + 1);
            }
        }

        for (int i = 0; i < uniqueWords.size(); i++) {
            System.out.println(uniqueWords.get(i) + ": " + wordCounts.get(i));
        }
    }

    public static List<Map<String, Object>> findOccurrence(List<String> list) {
        Map<String, Integer> wordAmount = new HashMap<>();
        List<Map<String, Object>> result = new ArrayList<>();


        for (String str : list) {
            wordAmount.put(str, wordAmount.getOrDefault(str, 0) + 1);
        }


        for (Map.Entry<String, Integer> entry : wordAmount.entrySet()) {
            Map<String, Object> wordInfo = new HashMap<>();
            wordInfo.put("name", entry.getKey());
            wordInfo.put("amount", entry.getValue());
            result.add(wordInfo);
        }

        return result;
    }
}