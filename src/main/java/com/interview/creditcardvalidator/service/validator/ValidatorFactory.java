package com.interview.creditcardvalidator.service.validator;

/*
Validator factory class which instantiates the validator objects
 */
public class ValidatorFactory {

    public static CardValidator getValidator(ValidatorType validatorType)
    {
        if (validatorType == ValidatorType.TYPE)
            return new CardTypeValidator();
        else if (validatorType == ValidatorType.DIGITS)
            return new DigitValidator();
        else if (validatorType == ValidatorType.LENGTH)
            return new LengthValidator();
        return new NullValidator();
    }
}
