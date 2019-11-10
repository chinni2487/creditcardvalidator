package com.interview.creditcardvalidator.service.card;

/*
	A class which holds MasterCard related metadata
*/
public class MasterCard implements Card{

	@Override
	public CreditCardType getCardType() {
		return CreditCardType.MASTERCARD;
	}

	@Override
	public int[] getLengthConstraints() {
		// TODO Auto-generated method stub
		return new int[] {16};
	}

	@Override
	public int[] getValidPrefix() {
		return new int[] {51,52,53,54,55};
	}

}
