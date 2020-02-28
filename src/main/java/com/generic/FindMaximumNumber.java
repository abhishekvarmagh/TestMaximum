package com.generic;

public class FindMaximumNumber {

    public Integer largest(Integer firstNumber, Integer secondNumber, Integer thirdNumber){
        Integer max = firstNumber;
        if (secondNumber.compareTo(max) > 0)
            max = secondNumber;
        if (thirdNumber.compareTo(max) > 0)
            max = thirdNumber;
        return max;
    }

    public Float largest(Float firstNumber, Float secondNumber, Float thirdNumber){
        Float max = firstNumber;
        if (secondNumber.compareTo(max) > 0)
            max = secondNumber;
        if (thirdNumber.compareTo(max) > 0)
            max = thirdNumber;
        return max;
    }

    public String largest(String x, String y, String z){
        String max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }
}