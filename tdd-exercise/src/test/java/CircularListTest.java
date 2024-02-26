import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

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
        CircularList circularList = new CircularList();
        assertTrue(circularList.isEmpty()); 
    }

}
