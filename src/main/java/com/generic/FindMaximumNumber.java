package com.generic;

public class FindMaximumNumber {

    public <E extends Comparable<E>> E largest(E firstNumber, E secondNumber, E thirdNumber) {
        E max = firstNumber;
        if (secondNumber.compareTo(max) > 0)
            max = secondNumber;
        if (thirdNumber.compareTo(max) > 0)
            max = thirdNumber;
        return max;
    }
}