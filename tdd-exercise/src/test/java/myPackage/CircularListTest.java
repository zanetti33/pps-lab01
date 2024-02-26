package myPackage;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Iterator;

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
    
}
