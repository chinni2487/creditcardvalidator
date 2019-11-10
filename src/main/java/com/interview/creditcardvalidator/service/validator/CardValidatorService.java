package com.interview.creditcardvalidator.service.validator;

import com.interview.creditcardvalidator.service.card.CreditCardType;

/*
Inteface for the service class
 */
public interface CardValidatorService {
    public boolean validateCard(String number);
    public CreditCardType getType();
}
