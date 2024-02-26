package tdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CircularListImpl implements CircularList {

    private List<Integer> list = new ArrayList<Integer>();
    private int nextPosition;

    @Override
    public void add(int element) {
        this.list.add(element);
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
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
