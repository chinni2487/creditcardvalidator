package com.interview.creditcardvalidator.utils;

import com.interview.creditcardvalidator.service.validator.CardValidator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CardValidatorUtilsTest {

    @Test
    public void testgetStrFromNumberShouldReturnString()
    {
        Assert.assertEquals(CardValidatorUtils.getStrFromNumber(2342222422423123123L),"2342222422423123123");
        Assert.assertEquals(CardValidatorUtils.getStrFromNumber(2323),"2323");
    }

    @Test
    public void teststripDataShouldReturnStrippedData()
    {
        Assert.assertEquals(CardValidatorUtils.stripData("4232 2312 3434 2123"), "4232231234342123");
        Assert.assertEquals(CardValidatorUtils.stripData("4232   2312    3434 2123"), "4232231234342123");
        Assert.assertEquals(CardValidatorUtils.stripData("    4232   2312    3434 2123"), "4232231234342123");
        Assert.assertEquals(CardValidatorUtils.stripData("4232   2312 3434 2123    "), "4232231234342123");
        Assert.assertEquals(CardValidatorUtils.stripData("4232231234342123"), "4232231234342123");
        Assert.assertEquals(CardValidatorUtils.stripData(null), "");
    }

    @Test
    public void testgetCumulativeValueShouldReturnSameNumber()
    {
        Assert.assertEquals(CardValidatorUtils.getCumulativeValue(2), 2);

        Assert.assertEquals(CardValidatorUtils.getCumulativeValue(-2), -2);

        Assert.assertEquals(CardValidatorUtils.getCumulativeValue(0), 0);
    }

    @Test
    public void testgetCumulativeValueShouldReturnSingleNumberForDoubleDigits()
    {
        Assert.assertEquals(CardValidatorUtils.getCumulativeValue(19), 1);
        Assert.assertEquals(CardValidatorUtils.getCumulativeValue(18), 9);
        Assert.assertEquals(CardValidatorUtils.getCumulativeValue(Integer.MAX_VALUE), 1);
    }
}




