<<<<<<<< HEAD:tdd-exercise/src/main/java/tdd/withIterators/CircularList.java
package tdd.withIterators;
========
package tdd.withIteretors;
>>>>>>>> 078dfdcbb51c5151944a2ca00f2dbe368eba4611:tdd-exercise/src/main/java/tdd/withIteretors/CircularList.java

import java.util.Iterator;

import tdd.common.GrowableList;

/**
 * Represents a list of integers, with access to two iterator.
 * One pass through the list forward, and ciculating, the other backward and circulating.
 * Example: with a list like {1,2,3}, the first call of next() for the first iterator 
 * returns 1, the second call returns 2, the third returns 3, 
 * the fourth returns 1, and so on. 
 * Call to next() of the second iterator goes in the other way.
 */
public interface CircularList extends GrowableList<Integer> {

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
