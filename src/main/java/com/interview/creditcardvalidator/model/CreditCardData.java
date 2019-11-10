package com.interview.creditcardvalidator.model;

/*
A pojo which holds the input object
 */
public class CreditCardData {

    private final String name;
    private final String cardNumber;
    private final int csv;

    public CreditCardData(String name, String cardNumber, int csv) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.csv = csv;
    }

    public String getName() {
        return name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getCsv() {
        return csv;
    }
}
