package com.interview.creditcardvalidator.service.validator;

import com.interview.creditcardvalidator.service.card.Card;
import com.interview.creditcardvalidator.service.card.CreditCardType;

/*
This class returns true or false based on the valid card type
 */
public class CardTypeValidator implements CardValidator {

    @Override
    public boolean isValid(String number, Card cardType) {
        if (cardType.getCardType() == CreditCardType.NONE)
            return false;
        else
            return true;
    }



}
