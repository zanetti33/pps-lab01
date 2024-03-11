<<<<<<<< HEAD:tdd-exercise/src/main/java/tdd/base/CircularList.java
package tdd.base;
========
package tdd.simple;
>>>>>>>> 078dfdcbb51c5151944a2ca00f2dbe368eba4611:tdd-exercise/src/main/java/tdd/simple/CircularList.java

import java.util.Optional;

import tdd.common.GrowableList;

/**
 * Represents a list of integers, with a built-in iterator that is bidirectional and circular.
 * Example: with a list like {1,2,3}, the first call of next() returns 1, the second call returns 2,
 * the third returns 3, the fourth returns 1, and so on. Call to previous() goes in the other way.
 */
public interface CircularList extends GrowableList<Integer> {

    /**
     * Provides the next element of the list, as given by the built-in iterator.
     * @return the next element of the list, or an empty optional if the list is empty
     */
    Optional<Integer> next();

    /**
     * Provides the previous element of the list. Its behaviour is dual of the next() method.
     * @return the previous element into the list
     */
    Optional<Integer> previous();

    /**
     * Reset the position of current element back to the first one of the list.
     * Note the first one is the first added to the list.
     */
    void reset();
}
