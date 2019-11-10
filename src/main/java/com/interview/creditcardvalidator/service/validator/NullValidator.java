package com.interview.creditcardvalidator.service.validator;

import com.interview.creditcardvalidator.service.card.Card;

/*
A null object so that factory class can avoid sending nulls. Nulls are bad !! Avoid them
 */
public class NullValidator implements CardValidator {

    @Override
    public boolean isValid(String number, Card cardType) {
        return false;
    }
}
