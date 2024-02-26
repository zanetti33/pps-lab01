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
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'hasNext'");
            }

            @Override
            public Integer next() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'next'");
            }
            
        };
    }

    @Override
    public Iterator<Integer> backwardIterator() {
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'hasNext'");
            }

            @Override
            public Integer next() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'next'");
            }
            
        };
    }
    
}
