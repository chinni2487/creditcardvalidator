package com.interview.creditcardvalidator.service.validator;

import com.interview.creditcardvalidator.service.card.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LengthValidatorTest {

    @DataProvider(name="dataForLengthValidator")
    public Object[][] dataForPrefixFail()
    {
        return new Object[][]{
                {"6011840040939891", new DiscoverCard()},
                {"6011367588986773", new DiscoverCard()},
                {"3785461322846127", new VisaCard()},
                {"5164013934137512", new MasterCard()},
                {"5228602544575115", new MasterCard()},
                {"4237328661591", new VisaCard()},
                {"4128914815620", new VisaCard()},
                {"341137268797822", new AmexCard()},
                {"6028401320035046", new VisaCard()},
                {"356781187715051", new AmexCard()},
           };
    }

    @Test(dataProvider = "dataForLengthValidator")
    public void testLengthValidatorReturnsACardValidation(String number, Card cardType  )
    {
        LengthValidator lengthValidator = new LengthValidator();
        boolean isValid = lengthValidator.isValid(number, cardType);
        Assert.assertTrue(isValid);

    }
}
