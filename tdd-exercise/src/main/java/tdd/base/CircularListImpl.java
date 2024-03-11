package tdd.base;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.BiFunction;

import tdd.common.CircularListNextIndex;
import tdd.common.GrowableListImpl;
import tdd.common.ReverseCircularListNextIndex;

public class CircularListImpl<T> extends GrowableListImpl<Integer> implements tdd.base.CircularList {

    private final static int PREVIOUS_INDEX_STARTING_POSITION = -1;
    private final static int NEXT_INDEX_STARTING_POSITION = 0;
    private final CircularListNextIndex getNextIndex = new CircularListNextIndex();
    private final ReverseCircularListNextIndex getPreviousIndex = new ReverseCircularListNextIndex();
    private int previousIndex = PREVIOUS_INDEX_STARTING_POSITION;
    private int nextIndex = NEXT_INDEX_STARTING_POSITION;

    @Override
    public Optional<Integer> next() {
        return this.getOptionalValue(getNextIndex);
    }

    @Override
    public Optional<Integer> previous() {
        return this.getOptionalValue(getPreviousIndex);
    }

    private Optional<Integer> getOptionalValue(BiFunction<Integer, Integer, Integer> nextIndexBiFunction) {
        if (this.isEmpty()) {
            return Optional.empty();
        }
        this.previousIndex = nextIndexBiFunction.apply(this.previousIndex, this.nextIndex);
        this.nextIndex = (this.nextIndex + 1) % this.size();
        return Optional.of(this.list.get(this.previousIndex));
    }

    @Override
    public void reset() {
        this.list = new ArrayList<>();
        this.previousIndex = PREVIOUS_INDEX_STARTING_POSITION;
        this.nextIndex = NEXT_INDEX_STARTING_POSITION;
    }


}
