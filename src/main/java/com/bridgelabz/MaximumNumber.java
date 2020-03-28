package com.bridgelabz;

public class MaximumNumber {
    public static void main(String[] args) {
        System.out.println("Welcome Find Maximum Number Problem");
    }

    public Integer findMaxValue(Integer first, Integer second, Integer third) {

        Integer maximumNumber = first;
        if (second.compareTo(maximumNumber) > 0)
            maximumNumber = second;
        if (third.compareTo(maximumNumber) > 0)
            maximumNumber = third;
        return maximumNumber;
    }
}
