import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import tdd.CircularList;
import tdd.CircularListImpl;

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
        CircularList circularList = new CircularListImpl();
    }

    @Test
    public void cirularListIsInitiallyEmpty() {
        CircularList circularList = new CircularListImpl();
        assertTrue(circularList.isEmpty()); 
    }

    @Test
    public void elementsCanBeAdded() {
        CircularList circularList = new CircularListImpl();
        circularList.add(0);
        assertFalse(circularList.isEmpty()); 
    }

    @Test
    public void nextGivesTheNextElement() {
        assertEquals(1, this.circularList.next().get());
    }

    
}
