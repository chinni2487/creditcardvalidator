package com.interview.creditcardvalidator.service.card;

/*
	A class which holds VisaCard related metadata
*/

public class VisaCard implements Card{

	@Override
	public CreditCardType getCardType() {
		return CreditCardType.VISA;
	}

	@Override
	public int[] getLengthConstraints() {
		// TODO Auto-generated method stub
		return new int[] {13, 16};
	}

	@Override
	public int[] getValidPrefix() {
		return new int[] {4};
	}

}
