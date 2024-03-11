package tdd.common;

import java.util.ArrayList;
import java.util.List;

public class GrowableListImpl<T> implements GrowableList<T> {

    protected List<T> list = new ArrayList<>();

    public void add(T element) {
        this.list.add(element);
    }

    public int size() {
        return this.list.size();
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }
}
