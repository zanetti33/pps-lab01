package tdd.common;

import java.util.function.BiFunction;

public class ReverseCircularListNextIndex implements BiFunction<Integer, Integer, Integer> {

    @Override
    public Integer apply(Integer previousIndex, Integer nextIndex) {
        return previousIndex;
    }
    
}
