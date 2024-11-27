package com.PaymentProcessorSystem.PaymentMethod;

import java.util.Map;

public class CreditCard implements PaymentMethod {
    private String cardNumber;
    private String expirationDate;
    private String cvv;
    private String nameOnCard;

    public CreditCard(Map<String, String> details) {
        this.cardNumber = details.get("cardNumber");
        this.expirationDate = details.get("expirationDate");
        this.cvv = details.get("cvv");
        this.nameOnCard = details.get("nameOnCard");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        System.out.println("Card Number: " + cardNumber);
    }
}
