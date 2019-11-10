package com.interview.creditcardvalidator.model;

/*
A pojo which holds the response object
 */
public class ValidationResponse {

    private final String name;
    private final String status;
    private final String cardType;


    public ValidationResponse(String name, String status, String cardType) {
        this.name = name;
        this.status = status;
        this.cardType = cardType;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getCardType() {
        return cardType;
    }
}
