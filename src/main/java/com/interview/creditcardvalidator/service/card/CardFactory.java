package com.interview.creditcardvalidator.service.card;

/*
A factory object which instantiates the card object based on type. If a new type has to be supported add additional condition in the method
 */

public class CardFactory {
	
	public static Card getCardType(CreditCardType type)
	{
		if (type == CreditCardType.AMEX)
			return new AmexCard();
		else if (type == CreditCardType.DISCOVER)
			return new DiscoverCard();
		else if (type == CreditCardType.MASTERCARD)
			return new MasterCard();
		else if (type == CreditCardType.VISA)
			return new VisaCard();

		return new NullCard();
		
	}

}
