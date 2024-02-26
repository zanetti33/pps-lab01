package tdd.simple;

import java.util.ArrayList;
import java.util.Optional;

import tdd.common.ListWrapper;

public class CircularListImpl extends ListWrapper<Integer> implements tdd.simple.CircularList {

    @Override
    public void add(int element) {
        super.add(element);
    }

    @Override
    public Optional<Integer> next() {
        if (this.list.isEmpty()) {
            return Optional.empty();
        }
        int nextValue = this.list.get(this.nextPosition);
        this.nextPosition = (this.nextPosition + 1) % this.list.size();
        return Optional.of(nextValue);
    }

    @Override
    public Optional<Integer> previous() {
        if (this.list.isEmpty()) {
            return Optional.empty();
        }
        this.nextPosition = this.nextPosition == 0 ? 
            this.list.size() - 1 : 
            this.nextPosition - 1;
        int nextValue = this.list.get(this.nextPosition);
        return Optional.of(nextValue);
    }

    @Override
    public void reset() {
        this.list = new ArrayList<>();
        this.nextPosition = 0;
    }

}
