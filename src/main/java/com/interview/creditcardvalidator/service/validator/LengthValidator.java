package com.interview.creditcardvalidator.service.validator;

import com.interview.creditcardvalidator.service.card.Card;

/*
Checks the length of the card number is within the mentioned limits of the card type
 */
public class LengthValidator implements CardValidator{
    @Override
    public boolean isValid(String number, Card cardType) {
        int cardLength = number.length();
        for (int length : cardType.getLengthConstraints())
        {
            if (cardLength == length)
                return true;
        }
        return false;
    }

}
