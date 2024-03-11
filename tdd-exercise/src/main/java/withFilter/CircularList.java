package withFilter;

import java.util.Optional;
import java.util.function.Predicate;

public interface CircularList extends tdd.CircularList {
    
    /**
     * Provides the next element of the list using the given filter.
     * @param filter
     * @return the next element of the list, or an empty optional if either the list is empty
     * or no element satisfies the given filter.
     */
    Optional<Integer> next(Predicate<Integer> filter);
}
