package com.interview.creditcardvalidator.service.card;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VisaCardTest {

    VisaCard visaCard = new VisaCard();

    @Test
    public void testLengthContraints() {
        int[] lengthConstraints = visaCard.getLengthConstraints();
        Assert.assertEquals(lengthConstraints.length,2);
        Assert.assertEquals(lengthConstraints[0],13);
        Assert.assertEquals(lengthConstraints[1],16);
    }

    @Test
    public void testPrefixContraints() {
        int[] prefixConstraints = visaCard.getValidPrefix();
        Assert.assertEquals(prefixConstraints.length, 1);
        Assert.assertEquals(prefixConstraints[0], 4);
    }

    @Test
    public void testCardType() {
        CreditCardType cardType = visaCard.getCardType();
        Assert.assertEquals(cardType, CreditCardType.VISA);
    }

}
