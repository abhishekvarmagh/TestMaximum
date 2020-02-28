package com.generic;

public class FindMaximumNumber<E extends Comparable<E>> {

    E firstNumber;
    E secondNumber;
    E thirdNumber;

    public FindMaximumNumber(E firstNumber, E secondNumber, E thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    public E largest() {
        return largest(firstNumber, secondNumber, thirdNumber);
    }

    public static <E extends Comparable<E>> E largest(E firstNumber, E secondNumber, E thirdNumber) {
        E max = firstNumber;
        if (secondNumber.compareTo(max) > 0)
            max = secondNumber;
        if (thirdNumber.compareTo(max) > 0)
            max = thirdNumber;
        return max;
    }
}