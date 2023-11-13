package org.course.hw11.tread_safe_list;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * Implementation of the ThreadSafeList interface using a ReentrantLock for thread safety.
 */
public class ThreadSafeListWithLock implements ThreadSafeList {
    private List<Integer> list;
    private Lock lock;

    /**
     * Constructs a new ThreadSafeListWithLock with an internal ArrayList and a ReentrantLock.
     */
    public ThreadSafeListWithLock() {
        this.list = new ArrayList<>();
        this.lock = new ReentrantLock();
    }

    /**
     * Adds the specified element to the list in a thread-safe manner.
     *
     * @param integer The element to be added to the list.
     */
    @Override
    public void add(Integer integer) {
        try {
            lock.lock();
            list.add(integer);
        } finally {
            lock.unlock();
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
            lock.lock();
            list.remove(integer);
        } finally {
            lock.unlock();
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
            lock.lock();
            return list.get(index);
        } finally {
            lock.unlock();
        }
    }

}
