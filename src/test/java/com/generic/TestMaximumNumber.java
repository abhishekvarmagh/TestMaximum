package com.generic;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumNumber {

    @Test
    public void givenMaxNumber_AtFirstPosition_ShouldReturnSameNumber() {
        FindMaximumNumber max = new FindMaximumNumber(9, 2, 1);
        Assert.assertEquals(9, max.largest());
    }

    @Test
    public void givenMaxNumber_AtSecondPosition_ShouldReturnSameNumber() {
        FindMaximumNumber max = new FindMaximumNumber(2, 10, 1);
        Assert.assertEquals(10, max.largest());
    }

    @Test
    public void givenMaxNumber_AtThirdPosition_ShouldReturnSameNumber() {
        FindMaximumNumber max = new FindMaximumNumber(2, 1, 7);
        Assert.assertEquals(7, max.largest());
    }

    @Test
    public void givenMaxFloatNumber_AtFirstPosition_ShouldReturnSameNumber() {
        FindMaximumNumber max = new FindMaximumNumber(9.0f, 2.0f, 1.0f);
        Assert.assertEquals(9.0f, (Float) max.largest(), 0.0f);
    }

    @Test
    public void givenMaxFloatNumber_AtSecondPosition_ShouldReturnSameNumber() {
        FindMaximumNumber max = new FindMaximumNumber(2.0f, 10.0f, 1.0f);
        Assert.assertEquals(10.0f, (Float) max.largest(), 0.0f);
    }

    @Test
    public void givenMaxFloatNumber_AtThirdPosition_ShouldReturnSameNumber() {
        FindMaximumNumber max = new FindMaximumNumber(2.0f, 1.0f, 7.0f);
        Assert.assertEquals(7.0f, (Float) max.largest(), 0.0f);
    }

    @Test
    public void givenMaxString_AtFirstPosition_ShouldReturnSameString() {
        FindMaximumNumber max = new FindMaximumNumber("Peach", "Banana", "Apple");
        Assert.assertEquals("Peach", max.largest());
    }

    @Test
    public void givenMaxString_AtSecondPosition_ShouldReturnSameString() {
        FindMaximumNumber max = new FindMaximumNumber("Banana", "Orange", "Apple");
        Assert.assertEquals("Orange", max.largest());
    }

    @Test
    public void givenMaxString_AtThirdPosition_ShouldReturnSameString() {
        FindMaximumNumber max = new FindMaximumNumber("Banana", "Apple", "Mango");
        Assert.assertEquals("Mango", max.largest());
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
