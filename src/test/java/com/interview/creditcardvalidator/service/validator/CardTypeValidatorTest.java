package com.interview.creditcardvalidator.service.validator;

import com.interview.creditcardvalidator.service.card.DiscoverCard;
import com.interview.creditcardvalidator.service.card.NullCard;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CardTypeValidatorTest {

    @Test
    public void cardTypeValidatorisValidShouldReturnTrueForValidCard()
    {
        CardTypeValidator cardTypeValidator = new CardTypeValidator();
        String number = "6011 2321 2321 2323";
        boolean isValid = cardTypeValidator.isValid(number, new DiscoverCard());
        Assert.assertTrue(isValid);
    }

    @Test
    public void cardTypeValidatorisValidShouldReturnFalseForInvalidCard()
    {
        CardTypeValidator cardTypeValidator = new CardTypeValidator();
        String number = "6011 2321 2321 2323";
        boolean isValid = cardTypeValidator.isValid(number, new NullCard());
        Assert.assertFalse(isValid);
    }
}
