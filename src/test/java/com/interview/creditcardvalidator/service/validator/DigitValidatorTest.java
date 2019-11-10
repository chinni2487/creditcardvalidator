package com.interview.creditcardvalidator.service.validator;

import com.interview.creditcardvalidator.service.card.DiscoverCard;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DigitValidatorTest {

    @DataProvider(name="dataForDigitValidator")
    public Object[][] dataForPrefixFail()
    {
        return new Object[][]{
                {"4508214399519624", true},
                {"342861513984429", true},
                {"5485461322846274", false},
                {"373249051341248", true},
                {"4128602544575115", false},
                {"4237328661591", false},
                {"5128914815620", true},
                {"6011480573080", false},
                {"6028401320035046", true},
                {"556781187715051", false},
           };
    }

    @Test(dataProvider = "dataForDigitValidator")
    public void testDigitValidatorReturnsAValidCardValidation(String number, boolean isValid )
    {
        DigitValidator digitValidator = new DigitValidator();
        boolean isNumberValid = digitValidator.isValid(number, new DiscoverCard());
        Assert.assertEquals(isNumberValid,isValid);

    }
}
