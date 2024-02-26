import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import tdd.CircularList;
import tdd.CircularListImpl;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {

    @Test
    public void creatingCircularList() {
        CircularList circularList = new CircularListImpl();
    }

    @Test
    public void checkingCirularListIsInitiallyEmpty() {
        CircularList circularList = new CircularListImpl();
        assertTrue(circularList.isEmpty()); 
    }
    
}
