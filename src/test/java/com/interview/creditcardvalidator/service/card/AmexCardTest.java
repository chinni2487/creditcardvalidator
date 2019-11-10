package com.interview.creditcardvalidator.service.card;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmexCardTest {

    AmexCard amexCard = new AmexCard();

    @Test
    public void testLengthContraints() {
        int[] lengthConstraints = amexCard.getLengthConstraints();
        Assert.assertEquals(lengthConstraints.length,1);
        Assert.assertEquals(lengthConstraints[0],15);
    }

    @Test
    public void testPrefixContraints() {
        int[] prefixConstraints = amexCard.getValidPrefix();
        Assert.assertEquals(prefixConstraints.length, 2);
        Assert.assertEquals(prefixConstraints[0], 34);
        Assert.assertEquals(prefixConstraints[1], 37);
    }

    @Test
    public void testCardType() {
        CreditCardType cardType = amexCard.getCardType();
        Assert.assertEquals(cardType, CreditCardType.AMEX);
    }

}
