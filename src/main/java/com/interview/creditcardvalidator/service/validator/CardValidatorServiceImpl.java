package com.interview.creditcardvalidator.service.validator;

import com.interview.creditcardvalidator.service.card.Card;
import com.interview.creditcardvalidator.service.card.CreditCardType;
import com.interview.creditcardvalidator.utils.CardValidatorUtils;
import org.springframework.stereotype.Service;

/*
Service class for the controller which tells if the card is valid or not and could also return the credit card type
 */
@Service
public class CardValidatorServiceImpl implements CardValidatorService {

	private CreditCardType cardType;
	public boolean validateCard(String number)
	{
		number = CardValidatorUtils.stripData(number);
		CardTypeObject cardTypeObject = new CardTypeObject(number);
		Card card = cardTypeObject.getCard();
		cardType = card.getCardType();
		for (ValidatorType validatorType: ValidatorType.values())
		{
			CardValidator validator = ValidatorFactory.getValidator(validatorType);
			if (!validator.isValid(number,card))
				return false;
		}
		return true;
	}

	@Override
	public CreditCardType getType() {
		return cardType;
	}

}
