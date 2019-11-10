package com.interview.creditcardvalidator.service.card;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MasterCardTest {

    MasterCard masterCard = new MasterCard();

    @Test
    public void testLengthContraints() {
        int[] lengthConstraints = masterCard.getLengthConstraints();
        Assert.assertEquals(lengthConstraints.length,1);
        Assert.assertEquals(lengthConstraints[0],16);
    }

    @Test
    public void testPrefixContraints() {
        int[] prefixConstraints = masterCard.getValidPrefix();
        Assert.assertEquals(prefixConstraints.length, 5);
        Assert.assertEquals(prefixConstraints[0], 51);
        Assert.assertEquals(prefixConstraints[1], 52);
        Assert.assertEquals(prefixConstraints[2], 53);
        Assert.assertEquals(prefixConstraints[3], 54);
        Assert.assertEquals(prefixConstraints[4], 55);

    }

    @Test
    public void testCardType() {
        CreditCardType cardType = masterCard.getCardType();
        Assert.assertEquals(cardType, CreditCardType.MASTERCARD);
    }

}
