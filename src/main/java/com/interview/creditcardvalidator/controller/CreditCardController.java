package com.interview.creditcardvalidator.controller;

import com.interview.creditcardvalidator.model.CreditCardData;
import com.interview.creditcardvalidator.model.ValidationResponse;
import com.interview.creditcardvalidator.service.card.CreditCardType;
import com.interview.creditcardvalidator.service.validator.CardValidatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/*

The controller which invokes the validation api.
Run the main class CreditCardValidatorApplication and invoke the rest api at http://localhost:8080/card/validate with POST method type
Request body
{
    "name":"Chinni",
    "cardNumber":"375317202309162",
    "csv":233
}
Response body
{
    "name": "Chinni",
    "status": "valid",
    "cardType": "AMEX"
}

 */
@RestController
@RequestMapping(path = "/card")
public class CreditCardController {

    @Autowired
    CardValidatorService cardValidatorService;

    @PostMapping(path = "/validate", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object>   validateCreditCard(@RequestBody CreditCardData cardDetails)
    {
        boolean isValid = cardValidatorService.validateCard(cardDetails.getCardNumber());

        CreditCardType cardType=CreditCardType.NONE;

        if (isValid)
            cardType = cardValidatorService.getType();

        String status = isValid?"valid":"invalid";

        ValidationResponse validationResponse = new ValidationResponse(cardDetails.getName(), status,cardType.toString());

        return new ResponseEntity<>(validationResponse, HttpStatus.OK);
    }
}
