package com.interview.creditcardvalidator.service.card;

/*
	A class which holds AmexCard related metadata
*/

public class AmexCard implements Card {

	@Override
	public CreditCardType getCardType() {
		return CreditCardType.AMEX;
	}

	@Override
	public int[] getLengthConstraints() {
		// TODO Auto-generated method stub
		return new int[] {15};
	}

	@Override
	public int[] getValidPrefix() {
		return new int[] {34,37};
	}

}
