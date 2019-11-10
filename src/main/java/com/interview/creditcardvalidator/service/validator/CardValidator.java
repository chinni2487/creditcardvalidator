package com.interview.creditcardvalidator.service.validator;

import com.interview.creditcardvalidator.service.card.Card;

/*
All validator types should implement this interface
 */
public interface CardValidator {
    public boolean isValid(String number, Card cardType);
}
