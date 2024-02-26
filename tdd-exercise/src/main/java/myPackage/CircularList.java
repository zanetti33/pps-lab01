package myPackage;

import java.util.Iterator;

/**
 * Represents a list of integers, with access to two iterator.
 * One pass through the list forward, and ciculating, the other backward and circulating.
 * Example: with a list like {1,2,3}, the first call of next() for the first iterator 
 * returns 1, the second call returns 2, the third returns 3, 
 * the fourth returns 1, and so on. 
 * Call to next() of the second iterator goes in the other way.
 */
public interface CircularList {

    /**
     * Adds an element to the list, namely, after the last inserted one.
     * @param element the element to be added to the list
     */
    void add(final int element);

    /**
     * Provides the current size of the list
     * @return the size of the list
     */
    int size();

    /**
     * Checks if the list is empty
     * @return true if the list is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Provides an iterator of the list that goes forward and circulates around
     * @return the iterator
     */
    Iterator<Integer> forwardIterator();

    /**
     * Provides an iterator of the list that goes backward and circulates around
     * @return the iterator
     */
    Iterator<Integer> backwardIterator();

}
