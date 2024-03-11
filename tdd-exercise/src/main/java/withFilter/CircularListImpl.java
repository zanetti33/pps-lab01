package withFilter;

import java.util.Optional;
import java.util.function.Predicate;

public class CircularListImpl extends tdd.CircularListImpl implements CircularList {

    @Override
    public Optional<Integer> next(Predicate<Integer> filter) {
        Optional<Integer> value = super.next();
        int counter = 1;
        while (value.isPresent() && 
            !(filter.test(value.get())) && 
            counter < super.size()) {
            value = super.next();
            counter++;
        }
        return counter < super.size() ?
            value :
            Optional.empty();
    }
    
}
