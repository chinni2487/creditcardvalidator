package com.interview.creditcardvalidator.service.validator;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreditCardDataValidatorTest {

    @DataProvider(name="creditCardTestData")
    public Object[][] creditCardTestDataPositive()
    {
        return new Object [][] {{"4408 0412 3456 7893"}};
    }

    @Test(dataProvider = "creditCardTestData")
    public void isCardValid(String number)
    {
        boolean output = new CardValidatorService().validateCard(number);
        Assert.assertTrue(output);


    }
}
