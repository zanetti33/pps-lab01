package myPackage;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {

    private CircularList circularList;

    @BeforeEach
    public void initializeCircularListWithElements() {
        this.circularList = new CircularListImpl();
        this.circularList.add(1);
        this.circularList.add(2);
        this.circularList.add(3);
        this.circularList.add(4);
        this.circularList.add(5);
    }

    @Test
    public void creatingCircularList() {
        @SuppressWarnings("unused")
        CircularList circularList = new CircularListImpl();
    }

    @Test
    public void forwardIteratorGivesElementsInOrder() {
        Iterator<Integer> iterator = this.circularList.forwardIterator();
        iterator.next();
        assertEquals(2, iterator.next());
    }

    @Test
    public void backwardIteratorGivesElementsInReverseOrder() {
        Iterator<Integer> iterator = this.circularList.backwardIterator();
        iterator.next();
        assertEquals(4, iterator.next());
    }

    @Test
    public void checkEmptyIteratorsDoesNotHaveNext() {
        Iterator<Integer> forwardIterator = new CircularListImpl().forwardIterator();
        Iterator<Integer> backwardIterator = new CircularListImpl().backwardIterator();
        assertFalse(forwardIterator.hasNext());
        assertFalse(backwardIterator.hasNext());
    }
    
    @Test
    public void callingNextInEmptyIteratorThrowsException() {
        Iterator<Integer> forwardIterator = new CircularListImpl().forwardIterator();
        Iterator<Integer> backwardIterator = new CircularListImpl().backwardIterator();
        assertThrows(NoSuchElementException.class, () -> forwardIterator.next());
        assertThrows(NoSuchElementException.class, () -> backwardIterator.next());
    }
    
}
