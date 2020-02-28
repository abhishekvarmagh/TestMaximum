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
        int largest = max.largest(3,2,1);
        Assert.assertEquals(3, largest);
    }

    @Test
    public void givenMaxNumber_AtSecondPosition_ShouldReturnSameNumber() {
        int largest = max.largest(2,3,1);
        Assert.assertEquals(3, largest);
    }

    @Test
    public void givenMaxNumber_AtThirdPosition_ShouldReturnSameNumber() {
        int largest = max.largest(2,1,3);
        Assert.assertEquals(3, largest);
    }
}
