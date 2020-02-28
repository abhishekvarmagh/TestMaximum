package com.generic;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumNumber {

    @Test
    public void givenMaxNumber_AtFirstPosition_ShouldReturnSameNumber() {
        FindMaximumNumber max = new FindMaximumNumber(3, 2, 1);
        Assert.assertEquals(3, max.largest());
    }

    @Test
    public void givenMaxNumber_AtSecondPosition_ShouldReturnSameNumber() {
        FindMaximumNumber max = new FindMaximumNumber(2, 3, 1);
        Assert.assertEquals(3, max.largest());
    }

    @Test
    public void givenMaxNumber_AtThirdPosition_ShouldReturnSameNumber() {
        FindMaximumNumber max = new FindMaximumNumber(2, 1, 3);
        Assert.assertEquals(3, max.largest());
    }

    @Test
    public void givenMaxFloatNumber_AtFirstPosition_ShouldReturnSameNumber() {
        FindMaximumNumber max = new FindMaximumNumber(3.0f, 2.0f, 1.0f);
        Assert.assertEquals(3.0f, (Float) max.largest(), 0.0f);
    }

    @Test
    public void givenMaxFloatNumber_AtSecondPosition_ShouldReturnSameNumber() {
        FindMaximumNumber max = new FindMaximumNumber(2.0f, 3.0f, 1.0f);
        Assert.assertEquals(3.0f, (Float) max.largest(), 0.0f);
    }

    @Test
    public void givenMaxFloatNumber_AtThirdPosition_ShouldReturnSameNumber() {
        FindMaximumNumber max = new FindMaximumNumber(2.0f, 1.0f, 3.0f);
        Assert.assertEquals(3.0f, (Float) max.largest(), 0.0f);
    }

    @Test
    public void givenMaxString_AtFirstPosition_ShouldReturnSameString() {
        FindMaximumNumber max = new FindMaximumNumber("Peach", "Banana", "Apple");
        Assert.assertEquals("Peach", max.largest());
    }

    @Test
    public void givenMaxString_AtSecondPosition_ShouldReturnSameString() {
        FindMaximumNumber max = new FindMaximumNumber("Banana", "Peach", "Apple");
        Assert.assertEquals("Peach", max.largest());
    }

    @Test
    public void givenMaxString_AtThirdPosition_ShouldReturnSameString() {
        FindMaximumNumber max = new FindMaximumNumber("Banana", "Apple", "Peach");
        Assert.assertEquals("Peach", max.largest());
    }

    @Test
    public void givenMoreThanThreeValue_ShouldReturnMaximum() {
        Assert.assertSame(6, FindMaximumNumber.largest(3, 2, 4, 5, 6));
    }

    @Test
    public void givenMoreThanThreeFloatValue_ShouldReturnMaximum() {
        Assert.assertEquals(3.0f, FindMaximumNumber.largest(1.0f, 2.0f, 2.2f, 3.0f), 0.0f);
    }

    @Test
    public void givenMoreThanThreeStringValue_ShouldReturnMaximum() {
        Assert.assertEquals("Peach", FindMaximumNumber.largest("Apple", "Banana", "Mango", "Orange", "Peach"));
    }
}
