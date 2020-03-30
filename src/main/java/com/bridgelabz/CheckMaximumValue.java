package com.bridgelabz;

public class CheckMaximumValue {

    public <E extends Comparable> E findMaxValue(E first, E second, E third) {
        E maxValue = first;
        if (second.compareTo(maxValue) > 0)
            maxValue = second;
        if (third.compareTo(maxValue) > 0)
            maxValue = third;
        return maxValue;
    }
}
