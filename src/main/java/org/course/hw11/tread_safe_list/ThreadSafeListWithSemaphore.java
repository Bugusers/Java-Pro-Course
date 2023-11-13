package org.course.hw11.tread_safe_list;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

/**
 * Implementation of the ThreadSafeList interface using a Semaphore for thread safety.
 */
public class ThreadSafeListWithSemaphore implements ThreadSafeList {
    private List<Integer> list;
    private Semaphore semaphore;

    /**
     * Constructs a new ThreadSafeListWithSemaphore with an internal ArrayList and a Semaphore.
     *
     * @param countOfThreads The maximum number of threads allowed to access the list concurrently.
     */
    public ThreadSafeListWithSemaphore(int countOfThreads) {
        this.list = new ArrayList<>();
        this.semaphore = new Semaphore(countOfThreads);
    }

    /**
     * Adds the specified element to the list in a thread-safe manner.
     *
     * @param integer The element to be added to the list.
     */
    @Override
    public void add(Integer integer) {
        try {
            semaphore.acquire();
            list.add(integer);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    /**
     * Removes the specified element from the list in a thread-safe manner.
     *
     * @param integer The element to be removed from the list.
     */
    @Override
    public void remove(Integer integer) {
        try {
            semaphore.acquire();
            list.remove(integer);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    /**
     * Retrieves the element at the specified index in the list in a thread-safe manner.
     *
     * @param index The index of the element to be retrieved.
     * @return The element at the specified index.
     */
    @Override
    public Integer get(int index) {
        try {
            semaphore.acquire();
            return list.get(index);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }
}
