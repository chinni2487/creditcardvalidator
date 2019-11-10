package com.interview.creditcardvalidator.service.validator;

import com.interview.creditcardvalidator.service.card.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CardTypeObjectTest {


    @DataProvider(name="successDataForPrefix")
    public Object[][] dataForPrefix()
    {
        return new Object[][]{
                {"6011 2321 2321 2323", new int[] {6011}},
                {"3422 2321 2321 233", new int[] {34,37}},
                {"3722 2321 2321 233", new int[] {34,37}},
                {"5123 2321 2321 2323", new int[] {51,52,53,54,55}},
                {"5223 2321 2321 2323", new int[] {51,52,53,54,55}},
                {"5323 2321 2321 2323", new int[] {51,52,53,54,55}},
                {"5423 2321 2321 2323", new int[] {51,52,53,54,55}},
                {"5523 2321 2321 2323", new int[] {51,52,53,54,55}},
                {"4523 2321 2321 2", new int[] {4}},
                {"4522 2321 2321 2322", new int[] {4}},
                {"8523 2321 2321 2323", new int[] {85}}
        };
    }

    @DataProvider(name="failDataForPrefix")
    public Object[][] dataForPrefixFail()
    {
        return new Object[][]{
                {"6011 2321 2321 2323", new int[] {6012}},
                {"3422 2321 2321 233", new int[] {31,32}},
                {"3722 2321 2321 233", new int[] {323}},
                {"5123 2321 2321 2323", new int[] {5122,52,53,54,55}},
                {"5223 2321 2321 2323", new int[] {51,5234,53,54,55}},
                {"5323 2321 2321 2323", new int[] {51,52,5345,54,55}},
                {"5423 2321 2321 2323", new int[] {51,52,53,5463,55}},
                {"5523 2321 2321 2323", new int[] {51,52,53,54,5534}},
                {"4523 2321 2321 2", new int[] {42,32}},
                {"4522 2321 2321 2322", new int[] {43,23,23}},
                {"8523 2321 2321 2323", new int[] {85232}}
        };
    }

    @DataProvider(name="cardType")
    public Object[][] dataForCardType()
    {
        return new Object[][]{
                {"6011 2321 2321 2323", DiscoverCard.class},
                {"3422 2321 2321 233", AmexCard.class},
                {"3722 2321 2321 233", AmexCard.class},
                {"5123 2321 2321 2323", MasterCard.class},
                {"5223 2321 2321 2323", MasterCard.class},
                {"5323 2321 2321 2323", MasterCard.class},
                {"5423 2321 2321 2323", MasterCard.class},
                {"5523 2321 2321 2323", MasterCard.class},
                {"4523 2321 2321 2", VisaCard.class},
                {"4522 2321 2321 2322", VisaCard.class},
                {"8523 2321 2321 2323", NullCard.class}
        };
    }


    @Test(dataProvider = "successDataForPrefix")
    public void testIsMatchingPrefixShouldReturnSuccess(String number, int[] prefix)
    {
        CardTypeObject card = new CardTypeObject(number);
        boolean matchingPrefix = card.isMatchingPrefix(number, prefix);
        Assert.assertTrue(matchingPrefix);
    }


    @Test(dataProvider = "failDataForPrefix")
    public void testIsMatchingPrefixShouldReturnFailure(String number, int[] prefix)
    {
        CardTypeObject card = new CardTypeObject(number);
        boolean matchingPrefix = card.isMatchingPrefix(number, prefix);
        Assert.assertFalse(matchingPrefix);
    }
    
    @Test(dataProvider = "cardType")
    public void testgetCardTypeShouldGetTheRightCardType(String number, Class object)
    {
        CardTypeObject card = new CardTypeObject(number);
        Card cardObject = card.getCard();
       Assert.assertTrue(object.isInstance(cardObject));
    }

}
