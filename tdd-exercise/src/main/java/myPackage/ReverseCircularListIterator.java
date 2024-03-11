package myPackage;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ReverseCircularListIterator<T> implements Iterator<T> {

    private final List<T> list;
    private int nextPosition;

    public ReverseCircularListIterator(List<T> list) {
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
        this.nextPosition = this.nextPosition == 0 ? 
            this.list.size() - 1 : 
            this.nextPosition - 1;
        return this.list.get(this.nextPosition);
    }
    
    
}