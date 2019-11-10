package com.interview.creditcardvalidator.service.card;

/*
	A class which holds DiscoverCard related metadata
*/
public class DiscoverCard implements Card{

	@Override
	public CreditCardType getCardType() {
		return CreditCardType.DISCOVER;
	}

	@Override
	public int[] getLengthConstraints() {
		// TODO Auto-generated method stub
		return new int[] {16};
	}

	@Override
	public int[] getValidPrefix() {
		return new int[] {6011};
	}

}
