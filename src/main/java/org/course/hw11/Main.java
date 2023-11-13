package org.course.hw11;


import org.course.hw11.station.PetrolStation;
import org.course.hw11.tread_safe_list.ThreadSafeList;
import org.course.hw11.tread_safe_list.ThreadSafeListWithLock;
import org.course.hw11.tread_safe_list.ThreadSafeListWithSemaphore;
import org.course.hw11.tread_safe_list.ThreadSafeListWithSynchronized;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // treadWithSemaphore();
        // treadWithSynchronized();
        treadWithLock();

        stationExample();
    }

    /**
     * Demonstrates the usage of a ThreadSafeList with a Semaphore.
     */
    public static void treadWithSemaphore() {
        ThreadSafeList threadSafeList = new ThreadSafeListWithSemaphore(5);


        for (int i = 0; i < 10; i++) {
            final int valueToAdd = i;
            new Thread(() -> {
                threadSafeList.add(valueToAdd);
                System.out.println("Added: " + valueToAdd);

                int indexToGet = valueToAdd % 5;
                Integer retrievedValue = threadSafeList.get(indexToGet);
                System.out.println("Retrieved: " + retrievedValue);

                threadSafeList.remove(valueToAdd);
                System.out.println("Removed: " + valueToAdd);
            }).start();
        }
    }


    /**
     * Demonstrates the usage of a ThreadSafeList with synchronized methods.
     */
    public static void treadWithSynchronized() {
        ThreadSafeList threadSafeList = new ThreadSafeListWithSynchronized();


        for (int i = 0; i < 10; i++) {
            final int valueToAdd = i;
            new Thread(() -> {
                threadSafeList.add(valueToAdd);
                System.out.println("Added: " + valueToAdd);

                int indexToGet = valueToAdd % 5;
                Integer retrievedValue = threadSafeList.get(indexToGet);
                System.out.println("Retrieved: " + retrievedValue);

                threadSafeList.remove(valueToAdd);
                System.out.println("Removed: " + valueToAdd);
            }).start();
        }
    }

    /**
     * Demonstrates the usage of a ThreadSafeList with a Lock.
     */
    public static void treadWithLock() {
        ThreadSafeList threadSafeList = new ThreadSafeListWithLock();


        for (int i = 0; i < 10; i++) {
            final int valueToAdd = i;
            new Thread(() -> {
                threadSafeList.add(valueToAdd);
                System.out.println("Added: " + valueToAdd);

                int indexToGet = valueToAdd % 5; // Just an example index
                Integer retrievedValue = threadSafeList.get(indexToGet);
                System.out.println("Retrieved: " + retrievedValue);

                threadSafeList.remove(valueToAdd);
                System.out.println("Removed: " + valueToAdd);
            }).start();
        }
    }

    /**
     * Demonstrates the usage of a PetrolStation example.
     */
    public static void stationExample() {
        PetrolStation station = new PetrolStation(2000);

        for(int i = 0; i < 20; i++) {
            new Thread(() -> {
                int amountRefuel = new Random().nextInt(90) + 10;
                station.doRefuel(amountRefuel);
            }).start();
        }
    }
}