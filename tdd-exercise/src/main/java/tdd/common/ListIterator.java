package tdd.common;

import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;

public class ListIterator<T> implements Iterator<T> {

    private final List<T> list;
    private int lastPosition;
    private final BiFunction<Integer, Integer, Integer> nextIndexBifunction;

    public ListIterator(List<T> list, BiFunction<Integer, Integer, Integer> nextIndexBifunction) {
        this.list = list;
        this.lastPosition = -1;
        this.nextIndexBifunction = nextIndexBifunction;
    }

    @Override
    public boolean hasNext() {
        return !this.list.isEmpty();
    }

    @Override
    public T next() {
        return this.list.get(
            this.nextIndexBifunction.apply(
                this.lastPosition, 
                this.list.size()
            )
        );
    }
    
}
