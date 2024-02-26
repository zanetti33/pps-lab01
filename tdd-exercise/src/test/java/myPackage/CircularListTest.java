package myPackage;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    
}
