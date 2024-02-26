package tdd.withFilter;

import java.util.Optional;
import java.util.function.Predicate;

public interface CircularList extends tdd.simple.CircularList {

    /**
     * Provides the next element of the list, as given by the built-in iterator,
     * which satisfies the predicate
     * @param predicate predicate used to filter the elements
     * @return the next element of the list, or an empty optional if the list is empty
     */
    Optional<Integer> filteredNext(Predicate<Integer> predicate);
}
