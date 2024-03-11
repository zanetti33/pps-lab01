package withFilter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;

public class CircularListTest {
    
    @Test
    public void nextWithFilter() {
        CircularList circularList = new CircularListImpl();
        int positiveValue = 4;
        circularList.add(-1);
        circularList.add(-2);
        circularList.add(-3);
        circularList.add(positiveValue);
        circularList.add(-5);
        assertEquals(Optional.of(positiveValue), circularList.next(x -> x > 0));
    }

    @Test
    public void nextWithFilterAndNoCongruentElements() {
        CircularList circularList = new CircularListImpl();
        circularList.add(-1);
        circularList.add(-2);
        circularList.add(-3);
        circularList.add(-4);
        circularList.add(-5);
        assertEquals(Optional.empty(), circularList.next(x -> x > 0));

    }
}
