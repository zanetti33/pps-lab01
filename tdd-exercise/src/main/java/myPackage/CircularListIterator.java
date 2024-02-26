package myPackage;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CircularListIterator<T> implements Iterator<T> {

    private final List<T> list;
    private final Boolean forward;
    private int nextPosition;

    public CircularListIterator(List<T> list, Boolean forward) {
        this.forward = forward;
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return !this.list.isEmpty();
    }

    @Override
    public T next() {
        if (hasNext()) {
            if (forward) {  
                T nextValue = this.list.get(this.nextPosition);
                this.nextPosition = (this.nextPosition + 1) % this.list.size();
                return nextValue;
            } else {
                this.nextPosition = this.nextPosition == 0 ? 
                    this.list.size() - 1 : 
                    this.nextPosition - 1;
                return this.list.get(this.nextPosition);
            }
        } else {
            throw new NoSuchElementException();
        }
    }
    
    
}
