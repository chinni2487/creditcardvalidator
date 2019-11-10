package com.interview.creditcardvalidator.service.card;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DiscoverCardTest {

    DiscoverCard discoverCard = new DiscoverCard();

    @Test
    public void testLengthContraints() {
        int[] lengthConstraints = discoverCard.getLengthConstraints();
        Assert.assertEquals(lengthConstraints.length,1);
        Assert.assertEquals(lengthConstraints[0],16);
    }

    @Test
    public void testPrefixContraints() {
        int[] prefixConstraints = discoverCard.getValidPrefix();
        Assert.assertEquals(prefixConstraints.length, 1);
        Assert.assertEquals(prefixConstraints[0], 6011);
    }

    @Test
    public void testCardType() {
        CreditCardType cardType = discoverCard.getCardType();
        Assert.assertEquals(cardType, CreditCardType.DISCOVER);
    }

}
