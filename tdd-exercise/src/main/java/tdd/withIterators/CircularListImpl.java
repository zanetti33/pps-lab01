package tdd.withIterators;

import java.util.Iterator;

import tdd.common.ListIterator;
import tdd.common.ReverseCircularListNextIndex;
import tdd.common.CircularListNextIndex;
import tdd.common.GrowableListImpl;

public class CircularListImpl extends GrowableListImpl<Integer> implements tdd.withIterators.CircularList {

    @Override
    public Iterator<Integer> forwardIterator() {
        return new ListIterator<Integer>(
            this.list, 
            new CircularListNextIndex()
        );
    }

    @Override
    public Iterator<Integer> backwardIterator() {
        return new ListIterator<Integer>(
            this.list, 
            new ReverseCircularListNextIndex()
        );
    }
    
}
