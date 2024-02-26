package myPackage;

import java.util.Iterator;

import common.ListWrapper;

public class CircularListImpl extends ListWrapper<Integer> implements CircularList {

    private int nextPosition;

    @Override
    public void add(int element) {
        super.add(element);
    }

    @Override
    public Iterator<Integer> forwardIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'forwardIterator'");
    }

    @Override
    public Iterator<Integer> backwardIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'backwardIterator'");
    }
    
}
