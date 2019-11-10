package com.interview.creditcardvalidator.service.validator;

import com.interview.creditcardvalidator.service.card.Card;
import com.interview.creditcardvalidator.service.card.CardFactory;
import com.interview.creditcardvalidator.service.card.CreditCardType;
import com.interview.creditcardvalidator.utils.CardValidatorUtils;

/*
This class gets the type of card based on the number that is passed. If the card is invalid it returns NONE card type
 */
public class CardTypeObject {

    private final String number;

    public CardTypeObject(String number)
    {
        this.number = number;
    }
    public Card getCard() {
        for (CreditCardType card : CreditCardType.values()) {
            Card cardType = CardFactory.getCardType(card);
            if (isMatchingPrefix(number, cardType.getValidPrefix()))
                return cardType;
        }
        return CardFactory.getCardType(CreditCardType.NONE);
    }

    boolean isMatchingPrefix(String number, int[] validPrefix) {
        for (int prefix: validPrefix)
        {
            if (isMatchingPrefix(number,prefix))
                return true;
        }
        return false;
    }

    private boolean isMatchingPrefix(String number, int prefix) {
        String strPrefix = CardValidatorUtils.getStrFromNumber(prefix);
        return strPrefix.equalsIgnoreCase(number.substring(0,strPrefix.length()));
    }
}
