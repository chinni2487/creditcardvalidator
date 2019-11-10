package com.interview.creditcardvalidator.service.card;

/*
	A class which holds NullCard related metadata. This is a null object to avoid nulls.
*/

public class NullCard implements Card{

	@Override
	public CreditCardType getCardType() {
		return CreditCardType.NONE;
	}

	@Override
	public int[] getLengthConstraints() {
		// TODO Auto-generated method stub
		return new int[] {0};
	}

	@Override
	public int[] getValidPrefix() {
		return new int[] {0};
	}

}
