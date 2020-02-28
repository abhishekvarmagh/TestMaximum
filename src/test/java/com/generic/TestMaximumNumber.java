package com.generic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMaximumNumber {

    @Test
    public void givenMaxNumber_AtFirstPosition_ShouldReturnSameNumber() {
        FindMaximumNumber max = new FindMaximumNumber(3, 2, 1);
        Comparable largest = max.largest();
        Assert.assertEquals(3, largest);
    }

    @Test
    public void givenMaxNumber_AtSecondPosition_ShouldReturnSameNumber() {
        FindMaximumNumber max = new FindMaximumNumber(2, 3, 1);
        Comparable largest = max.largest();
        Assert.assertEquals(3, largest);
    }

    @Test
    public void givenMaxNumber_AtThirdPosition_ShouldReturnSameNumber() {
        FindMaximumNumber max = new FindMaximumNumber(2, 1, 3);
        Comparable largest = max.largest();
        Assert.assertEquals(3, largest);
    }

    @Test
    public void givenMaxFloatNumber_AtFirstPosition_ShouldReturnSameNumber() {
        FindMaximumNumber max = new FindMaximumNumber(3.0f, 2.0f, 1.0f);
        Comparable largest = max.largest();
        Assert.assertEquals(3.0f, (Float) largest, 0.0f);
    }

    @Test
    public void givenMaxFloatNumber_AtSecondPosition_ShouldReturnSameNumber() {
        FindMaximumNumber max = new FindMaximumNumber(2.0f, 3.0f, 1.0f);
        Comparable largest = max.largest();
        Assert.assertEquals(3.0f, (Float) largest, 0.0f);
    }

    @Test
    public void givenMaxFloatNumber_AtThirdPosition_ShouldReturnSameNumber() {
        FindMaximumNumber max = new FindMaximumNumber(2.0f, 1.0f, 3.0f);
        Comparable largest = max.largest();
        Assert.assertEquals(3.0f, (Float) largest, 0.0f);
    }

    @Test
    public void givenMaxString_AtFirstPosition_ShouldReturnSameString() {
        FindMaximumNumber max = new FindMaximumNumber("Peach", "Banana", "Apple");
        Comparable largest = max.largest();
        Assert.assertEquals("Peach", largest);
    }

    @Test
    public void givenMaxString_AtSecondPosition_ShouldReturnSameString() {
        FindMaximumNumber max = new FindMaximumNumber("Banana", "Peach", "Apple");
        Comparable largest = max.largest();
        Assert.assertEquals("Peach", largest);
    }

    @Test
    public void givenMaxString_AtThirdPosition_ShouldReturnSameString() {
        FindMaximumNumber max = new FindMaximumNumber("Banana", "Apple", "Peach");
        Comparable largest = max.largest();
        Assert.assertEquals("Peach", largest);
    }
}
