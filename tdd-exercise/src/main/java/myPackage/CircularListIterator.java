package myPackage;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CircularListIterator<T> implements Iterator<T> {

    private final List<T> list;
    private int nextPosition;

    public CircularListIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return !this.list.isEmpty();
    }

    @Override
    public T next() {
        if (this.list.isEmpty()) {
            throw new NoSuchElementException();
        }
        T nextValue = this.list.get(this.nextPosition);
        this.nextPosition = (this.nextPosition + 1) % this.list.size();
        return nextValue;
    }
    
    
}
