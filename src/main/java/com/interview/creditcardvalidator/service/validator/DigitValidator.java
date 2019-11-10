package com.interview.creditcardvalidator.service.validator;

import com.interview.creditcardvalidator.service.card.Card;
import com.interview.creditcardvalidator.utils.CardValidatorUtils;

/*
This class computes the luhn algorithm in checking if the card number is valid or not
 */
public class DigitValidator implements CardValidator {
    @Override
    public boolean isValid(String number,Card cardType) {
        int sum = sumOfEvenNumbers(number) + sumOfOddNumbers(number);
        if (sum % 10 == 0)
            return true;

        return false;
    }

    private int sumOfOddNumbers(String number) {

        int sum = 0;
        for (int i = number.length()-1; i >= 0 ; i-=2 )
            sum += Integer.parseInt(number.charAt(i)+"");

        return sum;
    }

    private int sumOfEvenNumbers(String number) {

        int sum = 0;
        for (int i = number.length() - 2 ; i >= 0 ; i-=2)
            sum += CardValidatorUtils.getCumulativeValue(Integer.parseInt(number.charAt(i)+"") * 2);

        return sum;
    }

}
