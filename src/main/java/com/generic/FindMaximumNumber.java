package com.generic;

import java.util.Arrays;

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

    public static <E extends Comparable<E>> E largest(E firstNumber, E secondNumber, E thirdNumber, E... option) {
        E max = firstNumber;
        if (secondNumber.compareTo(max) > 0)
            max = secondNumber;
        if (thirdNumber.compareTo(max) > 0)
            max = thirdNumber;
        if (option.length != 0) {
            Arrays.sort(option);
            if (option[option.length - 1].compareTo(max) > 0)
                max = option[option.length - 1];
        }
        printMax(max);
        return max;
    }

    private static <E extends Comparable<E>> void printMax(E max) {
        System.out.println("Max is "+max);
    }
}