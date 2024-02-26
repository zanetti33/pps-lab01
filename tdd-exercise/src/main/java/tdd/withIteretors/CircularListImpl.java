package tdd.withIteretors;

import java.util.Iterator;

import tdd.common.ListWrapper;

public class CircularListImpl extends ListWrapper<Integer> implements ListWrapper {
    @Override
    public void add(int element) {
        super.add(element);
    }

    @Override
    public Iterator<Integer> forwardIterator() {
        return new CircularListIterator<Integer>(this.list, true);
    }

    @Override
    public Iterator<Integer> backwardIterator() {
        return new CircularListIterator<Integer>(this.list, false);
    }
    
}
