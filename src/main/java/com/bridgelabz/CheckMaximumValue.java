package com.bridgelabz;

public class CheckMaximumValue<E extends Comparable> {
    E first;
    E second;
    E third;

    public CheckMaximumValue(E first, E second, E third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public E findMaxValue() {
        E maxValue = first;
        if (second.compareTo(maxValue) > 0)
            maxValue = second;
        if (third.compareTo(maxValue) > 0)
            maxValue = third;
        return maxValue;
    }
}
