# creditcardvalidator

The rest api verified is the provided credit card is valid or not. It uses spring boot to instantiate the api. The project is managed using gradle. 

## Running program:

./gradlew bootRun

Let the program download the required dependencies. Once the download is complete, access the rest api using the below url.

## Rest details
Request url:
http://localhost:8080/card/validate

Method type: POST

Request body: 
```
{
    "name":"Chinni",
    "cardNumber":"375317202320912",
    "csv":233
}
```

Response body:
```
{
    "name": "Chinni",
    "status": "valid",
    "cardType": "AMEX"
}
```
