# Java-Pro-Course
## Repository with course homework a description of the assignment

### Homework №3 Introduction to OOP
This part of the course focuses on object-oriented programming concepts in Java. The code is organized into several packages and classes to demonstrate the following:

- **Car and Employee Classes:** The `Car` class represents a simple car object, and the `Employee` class represents an employee with a car. The `Main` class in the `org.course.hw3` package demonstrates how these classes can be used together.

- **Car Class:** The `Car` class has methods to start and stop the car, as well as display car information. It showcases encapsulation and object-oriented principles.

- **Employee Class:** The `Employee` class represents an employee with properties like name, email, phone, position, and age. It also has an association with the `Car` class.

- **Main Class:** The `Main` class demonstrates the usage of the `Car` and `Employee` classes by creating an employee with a car and starting/stopping the car.



### Homework №4 Inheritance in Java
This part of the course explores the use of abstract classes and interfaces to create a simple animal classification system in Java. The code is organized into different packages and classes, each showcasing a different approach:

- **AbstractClass Package:** Demonstrates the use of abstract classes for animal classification. The `Main` class creates instances of dogs and cats, calculates the distance they can run and swim, and counts the total number of dogs and cats.

- **Interface Package:** Shows the use of interfaces for animal classification. The `Main` class creates instances of dogs and cats, calculates the distance they can run and swim, and counts the total number of dogs and cats.

- **Dog and Cat Classes:** Both the abstract and interface-based approaches have separate `Dog` and `Cat` classes, each implementing the respective behavior for running and swimming based on their type.

- **Animals Abstract Class and Interface:** Defines the common structure and behavior for animals using an abstract class (`Animals`) and an interface (`Animals`). This includes properties like name, breed, and age, as well as methods for running and swimming.

The `Main` class in each package demonstrates how these classes and interfaces are used to create and manage animal instances.

### Homework №5 Polymorphism in Java
In this part of the course, we explore polymorphism in Java. The program simulates a competition between participants and obstacles.

- **Figures Package:** Demonstrates the use of interfaces to create different shapes, such as circles, squares, and triangles. These shapes calculate their respective areas and are stored in an array. The `Main` class calculates the total area of all shapes.

- **Obstacle Package:** Introduces the concept of obstacles, such as running tracks and walls. These obstacles can be overcome by participants.

- **Participant Package:** Defines different types of participants: `Person`, `Cat`, and `Robot`. Each participant has maximum running and jumping abilities.

- **Main Class:** Combines participants and obstacles to simulate a competition. It calculates the success of each participant in overcoming obstacles and provides feedback based on their performance.

### Homework №6 Primitive and reference data types
- **printThreeWords():** A function that prints three words on the console: "Orange," "Banana," and "Apple."

- **checkSumSign():** A function that checks the sign of the sum of two numbers and prints an appropriate message.

- **printColor():** A function that prints a color status based on a given numeric value.

- **compareNumbers():** A function that compares two numbers and prints the comparison result.

- **isSumInRange(int num1, int num2):** A function that checks if the sum of two numbers is in the range from 10 to 20 (inclusive).

- **checkNumber(int num):** A function that checks if a number is positive or negative and prints the appropriate message.

- **isNegativeNum(int num):** A function that checks if a number is negative.

- **printStringMultipleTimes(String text, int count):** A function that prints a given string a specified number of times.

- **isLeapYear(int year):** A function that checks if a year is a leap year based on specified conditions.


### Homework №7 String and char

This homework assignment focuses on string manipulation tasks in Java. You will be implementing methods to find symbol occurrences, word positions, reverse strings, check for palindromes, and play a word guessing game.

- **Task 1**: Find Symbol Occurrences: Implement a method findSymbolOccurance(String source, char symbol) that counts the number of times a given symbol (symbol) appears in a given string (source).

- **Task 2**: Find Word Position: Implement a method findWordPosition(String source, String target) that finds the index of the first occurrence of a given target string (target) in a given source string (source). If the target string is not found, return -1.

- **Task 3**: Reverse String: Implement a method stringReverse(String source) that reverses the characters in a given string (source). Return the reversed string.

- **Task 4**: Check for Palindrome: Implement a method isPalindrome(String text) that checks if a given string (text) is a palindrome. A palindrome is a string that reads the same backward as forward, ignoring non-alphanumeric characters.

- **Task 5**: Word Guessing Game: Implement a method wordGame() that plays a word guessing game. The game should randomly select a word from a list of words and allow the user to guess the word. The game should provide feedback and hints to the user.


### Homework №8 Exceptions

**The ArrayValueCalculator class**

This class provides methods for calculating the sum of integers in a 4x4 matrix and validating the input data. It uses two exceptions to handle invalid input:

    ArraySizeException: Thrown when the matrix does not have the correct size (4x4).
    ArrayDataException: Thrown when any cell in the matrix contains non-integer data.

The doCalc method calculates the sum of the integers in the matrix and throws an exception if the input data is invalid. It first checks the size of the matrix using Arrays.stream(matrix).anyMatch(row -> row.length != 4). If the matrix is not 4x4, it throws an ArraySizeException.

If the matrix has the correct size, it converts each element of the matrix to an integer using Integer.parseInt(matrix[i][j]) and stores the result in a new 2D array. It then calculates the sum of all the values in the new array using Arrays.stream(result) .mapToInt(row -> Arrays.stream(row).sum()) .sum() and returns the sum.

**The ArrayDataException and ArraySizeException classes**

These classes are used to encapsulate exceptions that arise from invalid input data. ArrayDataException is a subclass of NumberFormatException, which is thrown when an attempt is made to convert a string to a number that cannot be parsed. ArraySizeException is a subclass of ArithmeticException, which is thrown when an arithmetic operation results in an error.

**The Main class**

This class provides an example of how to use the ArrayValueCalculator class. It creates three arrays: arr1, arr2, and arr3. The first array is a valid 4x4 matrix, the second array has a non-integer value, and the third array has different row lengths.

The Main class calls the doCalc method for each array and catches any exceptions that are thrown. If an exception is thrown, it prints an error message to the console

