package tdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CircularListImpl implements CircularList {

    private final List<Integer> list = new ArrayList<Integer>();
    private int position;

    @Override
    public void add(int element) {
        this.list.add(element);
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public Optional<Integer> next() {
        int nextValue = this.list.get(this.position);
        this.position = (this.position + 1) % this.list.size();
        return Optional.of(nextValue);
    }

    @Override
    public Optional<Integer> previous() {
        this.position = this.position == 0 ? this.list.size() - 1 : this.position - 1;
        int nextValue = this.list.get(this.position);
        return Optional.of(nextValue);
    }

    @Override
    public void reset() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reset'");
    }

}
