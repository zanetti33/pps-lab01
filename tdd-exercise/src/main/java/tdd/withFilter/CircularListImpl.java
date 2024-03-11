package tdd.withFilter;

import java.util.Optional;
import java.util.function.Predicate;

public class CircularListImpl extends tdd.base.CircularListImpl<Integer> implements CircularList {

    @Override
    public Optional<Integer> filteredNext(Predicate<Integer> predicate) {
        return null;
    }
    
}
