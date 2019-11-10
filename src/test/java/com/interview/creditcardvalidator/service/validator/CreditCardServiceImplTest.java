package com.interview.creditcardvalidator.service.validator;


import com.interview.creditcardvalidator.service.card.CreditCardType;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreditCardServiceImplTest {

    @DataProvider(name="dataForDigitValidator")
    public Object[][] dataForPrefixFail()
    {
        return new Object[][]{
                {"4929752659791483", true, CreditCardType.VISA},
                {"4532589601406185", true,CreditCardType.VISA},
                {"6011444561503677", true,CreditCardType.DISCOVER},
                {"6011124506887506", true, CreditCardType.DISCOVER},
                {"4508646445714594", true, CreditCardType.VISA},
                {"5336064868922360", true, CreditCardType.MASTERCARD},
                {"5566048918567722", true, CreditCardType.MASTERCARD},
                {"5227207194619224", true, CreditCardType.MASTERCARD},
                {"379325355251954", true, CreditCardType.AMEX},
                {"375317202309162", true,CreditCardType.AMEX},
                {"375317202262", false,CreditCardType.NONE},
                {"2332375317202309162", false,CreditCardType.NONE},
                {"3752309162", false,CreditCardType.NONE},
        };
    }

    @Test(dataProvider = "dataForDigitValidator")
    public void testDigitValidatorReturnsAValidCardValidation(String number, boolean isValid, CreditCardType cardType)
    {
        CardValidatorService cardValidatorService = new CardValidatorServiceImpl();
        boolean isValidCard = cardValidatorService.validateCard(number);
        CreditCardType type = cardValidatorService.getType();
        Assert.assertEquals(isValidCard,isValid);
        Assert.assertEquals(type, cardType);

    }
}
