package com.interview.creditcardvalidator.service.card;

/*
All the card types should implement this interface
 */

public interface Card {
	
	public CreditCardType getCardType();

	public int[] getLengthConstraints();
	
	public int[] getValidPrefix();
	
}
