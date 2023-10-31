package org.course.hw7;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Result: " + findSymbolOccurance("Name with Jane", 'a'));



        System.out.println("Result: " + findWordPosition("Apollo", "pollo"));
        System.out.println("Result: " + findWordPosition("Apple", "Plant"));


        System.out.println("Result: " + stringReverse("Hello"));

        System.out.println("Result: " + isPalindrome("Hello"));
        System.out.println("Result: " + isPalindrome("ERE"));


        wordGame();
    }


    // Task 1
    /**
     * This method finds the number of occurrences of a given symbol in a string.
     *
     * @param source The input string in which to search for occurrences.
     * @param symbol The symbol to find in the input string.
     * @return The number of times the symbol appears in the input string.
     */
    public static int findSymbolOccurance(String source, char symbol) {
         if (source.isEmpty()) {
            return 0;
        }
        return (int) source.chars()
                .filter(c -> c == symbol)
                .count();
    }

    // Task 2
    /**
     * This method finds the position of the first occurrence of a target string in the source string.
     *
     * @param source The source string in which to search for the target string.
     * @param target The target string to find in the source string.
     * @return The index of the first occurrence of the target string in the source string, or -1 if not found.
     */
    public static int findWordPosition(String source, String target) {
        if (source.isEmpty() || target.isEmpty()) {
            return -1;
        }

        if (source.contains(target)) {
            return source.indexOf(target);
        }

        return -1;
    }

    // Task 3
    /**
     * This method reverses the characters in a given string.
     *
     * @param source The input string to be reversed.
     * @return The reversed string.
     */
    public static String stringReverse(String source) {
        if (source == null || source.isEmpty()) {
            return "String cannot be empty or null";
        }


        StringBuilder result = new StringBuilder(source);
        return result.reverse().toString();
    }

    // Task 4
    /**
     * This method checks if a given string is a palindrome, ignoring non-alphanumeric characters.
     *
     * @param text The input string to check for palindrome status.
     * @return true if the input string is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String text) {
        return text.replaceAll("\\W","")
                .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W",""))
                        .reverse()
                        .toString());
    }

    // Task 5
    /**
     * This method implements a word guessing game where the user tries to guess a random word.
     */
    public static void wordGame() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random random = new Random();
        String randomWord = words[random.nextInt(words.length)];
        int randomWordLen = randomWord.length() + (15 - randomWord.length());

        char[] displayWord = new char[randomWordLen];
        for (int i = 0; i < randomWordLen; i++) {
            displayWord[i] = '#';
        }

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Спробуйте вгадати слово: " + new String(displayWord));
            String userGuess = sc.next().toLowerCase();

            if (userGuess.equals(randomWord)) {
                System.out.println("Ви вгадали слово! Загадане слово було: " + randomWord);
                break;
            } else {
                for (int i = 0; i < randomWord.length(); i++) {
                    if (userGuess.length() > i && userGuess.charAt(i) == randomWord.charAt(i)) {
                        displayWord[i] = randomWord.charAt(i);
                    }
                }
            }
        }
    }


//    public static void wordGameOtherVersion() {
//        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
//                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
//                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//
//        Random random = new Random();
//        String randomWord = words[random.nextInt(words.length)];
//        int randomWordLen = randomWord.length();
//
//        char[] displayWord = new char[randomWordLen];
//        for (int i = 0; i < randomWordLen; i++) {
//            displayWord[i] = '#';
//        }
//
//        Scanner sc = new Scanner(System.in);
//        int attempts = 6;
//
//        System.out.println("Спробуйте вгадати слово з " + randomWordLen + " букв.");
//        while (attempts > 0) {
//            System.out.println("Попыток осталось: " + attempts);
//            System.out.println("Поточне слово: " + new String(displayWord));
//            System.out.print("Введіть букву або слово цілком: ");
//            String userGuess = sc.next().toLowerCase();
//
//            if (userGuess.equals(randomWord)) {
//                System.out.println("Ви вгадали слово! Загадане слово було: " + randomWord);
//                break;
//            } else if (userGuess.length() == 1) {
//                char guessChar = userGuess.charAt(0);
//                boolean found = false;
//                for (int i = 0; i < randomWord.length(); i++) {
//                    if (randomWord.charAt(i) == guessChar && displayWord[i] == '#') {
//                        displayWord[i] = guessChar;
//                        found = true;
//                    }
//                }
//                if (!found) {
//                    System.out.println("Ця буква в слові відсутня.");
//                    attempts--;
//                }
//            } else {
//                System.out.println("Неправильне слово. Спробуйте ще.");
//                attempts--;
//            }
//
//            if (new String(displayWord).equals(randomWord)) {
//                System.out.println("Ви вгадали слово! Загадане слово було: " + randomWord);
//                break;
//            }
//        }
//
//        if (attempts == 0) {
//            System.out.println("Спроби закінчилися. Загадане слово було: " + randomWord);
//        }
//    }
}