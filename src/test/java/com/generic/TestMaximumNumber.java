package com.generic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMaximumNumber {

    private FindMaximumNumber max;

    @Before
    public void initialize() {
        max = new FindMaximumNumber();
    }

    @Test
    public void givenMaxNumber_AtFirstPosition_ShouldReturnSameNumber() {
        int largest = max.largest(3, 2, 1);
        Assert.assertEquals(3, largest);
    }

    @Test
    public void givenMaxNumber_AtSecondPosition_ShouldReturnSameNumber() {
        int largest = max.largest(2, 3, 1);
        Assert.assertEquals(3, largest);
    }

    @Test
    public void givenMaxNumber_AtThirdPosition_ShouldReturnSameNumber() {
        int largest = max.largest(2, 1, 3);
        Assert.assertEquals(3, largest);
    }

    @Test
    public void givenMaxFloatNumber_AtFirstPosition_ShouldReturnSameNumber() {
        float largest = max.largest(3.0f, 2.0f, 1.0f);
        Assert.assertEquals(3.0f, largest, 0.0f);
    }

    @Test
    public void givenMaxFloatNumber_AtSecondPosition_ShouldReturnSameNumber() {
        float largest = max.largest(2.0f, 3.0f, 1.0f);
        Assert.assertEquals(3.0f, largest, 0.0f);
    }

    @Test
    public void givenMaxFloatNumber_AtThirdPosition_ShouldReturnSameNumber() {
        float largest = max.largest(2.0f, 1.0f, 3.0f);
        Assert.assertEquals(3.0f, largest, 0.0f);
    }

    @Test
    public void givenMaxString_AtFirstPosition_ShouldReturnSameString() {
        String largest = max.largest("Peach", "Banana", "Apple");
        Assert.assertEquals("Peach", largest);
    }

    @Test
    public void givenMaxString_AtSecondPosition_ShouldReturnSameString() {
        String largest = max.largest("Banana", "Peach", "Apple");
        Assert.assertEquals("Peach", largest);
    }

    @Test
    public void givenMaxString_AtThirdPosition_ShouldReturnSameString() {
        String largest = max.largest("Banana", "Apple", "Peach");
        Assert.assertEquals("Peach", largest);
    }
}
