package org.course.hw11.tread_safe_list;

import java.util.ArrayList;
import java.util.List;

public class ThreadSafeListWithSynchronized implements ThreadSafeList{
    private List<Integer> list;

    /**
     * Implementation of the ThreadSafeList interface using synchronized methods for thread safety.
     */
    public ThreadSafeListWithSynchronized() {
        this.list = new ArrayList<>();
    }

    /**
     * Adds the specified element to the list in a thread-safe manner.
     *
     * @param integer The element to be added to the list.
     */
    @Override
    public synchronized void add(Integer integer) {
        list.add(integer);
    }

    /**
     * Removes the specified element from the list in a thread-safe manner.
     *
     * @param integer The element to be removed from the list.
     */
    @Override
    public synchronized void remove(Integer integer) {
        list.remove(integer);
    }

    /**
     * Retrieves the element at the specified index in the list in a thread-safe manner.
     *
     * @param index The index of the element to be retrieved.
     * @return The element at the specified index.
     */
    @Override
    public synchronized Integer get(int index) {
        return list.get(index);
    }
}
