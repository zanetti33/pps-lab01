package tdd.base;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tdd.common.GrowableList;
import tdd.common.GrowableListTest;

/**
 * The test suite for testing the tdd.base.CircularList implementation
 */
public class CircularListTest extends GrowableListTest {

    private CircularListImpl<Integer> circularList;
    private static final int FIRST_ELEMENT = 1;
    private static final int SECOND_ELEMENT = 2;
    private static final int THIRD_ELEMENT = 3;

    // this method (thanks to GrowableListTest abstract class) tests
    // some common methods such as empty(), size() and add(element)
    protected GrowableList<Integer> newGrowableList() {
        return new CircularListImpl<>();
    }

    @BeforeEach
    public void initializeListWithSomeValues() {
        this.circularList = new CircularListImpl<>();
        this.circularList.add(FIRST_ELEMENT);
        this.circularList.add(SECOND_ELEMENT);
        this.circularList.add(THIRD_ELEMENT);
    }

    @Test
    public void nextGivesTheNextElement() {
        assertEquals(FIRST_ELEMENT, this.circularList.next().get());
    }

    @Test 
    public void nextGivesTheFirstElementAfterTheLast() {
        this.circularList.next();
        this.circularList.next();
        this.circularList.next();
        assertEquals(FIRST_ELEMENT, this.circularList.next().get());
    }
    
    @Test
    public void previousGivesThePreviousElement() {
        this.circularList.next();
        assertEquals(FIRST_ELEMENT, this.circularList.previous().get());
    }

    @Test 
    public void previousGivesTheLastElementInitially() {
        assertEquals(THIRD_ELEMENT, this.circularList.previous().get());
    }
    
    @Test
    public void sizeGivesTheCorrectValue() {
        int actualSize = 3;
        assertEquals(actualSize, this.circularList.size());
    }
    
    @Test
    public void resetEmptiesTheList() {
        this.circularList.reset();
        assertTrue(this.circularList.isEmpty());
    }

    @Test
    public void gettingAnElementFromAnEmptyCircularListGivesAnEmptyOptional() {
        CircularList circularList = new CircularListImpl<>();
        assertTrue(circularList.next().isEmpty());
    }
}
