package tdd.common;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public abstract class GrowableListTest {

    @Test
    public void creatingCircularList() {
        @SuppressWarnings("unused")
        GrowableList<Integer> circularList = newGrowableList();
    }

    protected abstract GrowableList<Integer> newGrowableList();

    @Test
    public void cirularListIsInitiallyEmpty() {
        GrowableList<Integer> circularList = newGrowableList();
        assertTrue(circularList.isEmpty()); 
    }

    @Test
    public void elementsCanBeAdded() {
        GrowableList<Integer> circularList = newGrowableList();
        circularList.add(0);
        assertFalse(circularList.isEmpty()); 
    }

}
