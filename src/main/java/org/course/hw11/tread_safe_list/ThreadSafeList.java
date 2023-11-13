package org.course.hw11.tread_safe_list;

public interface ThreadSafeList {
    /**
     * Adds the specified element to the list.
     *
     * @param integer The element to be added to the list.
     */
    void add(Integer integer);

    /**
     * Removes the specified element from the list.
     *
     * @param integer The element to be removed from the list.
     */
    void remove(Integer integer);

    /**
     * Retrieves the element at the specified index in the list.
     *
     * @param index The index of the element to be retrieved.
     * @return The element at the specified index.
     */
    Integer get(int index);

}
