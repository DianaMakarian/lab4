package com.PaymentProcessorSystem.PaymentMethod;

import java.util.HashMap;

public class CreditCard implements PaymentMethod {
    private String cardNumber;
    private String expirationDate;
    private String cvv;
    private String nameOnCard;

    public CreditCard(double amount, HashMap<String, String> details) {
        this.cardNumber = details.get("cardNumber");
        this.expirationDate = details.get("expirationDate");
        this.cvv = details.get("cvv");
        this.nameOnCard = details.get("nameOnCard");
        processPayment(amount);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        System.out.println("Card number: " + cardNumber);
        System.out.println("Expiration date: " + expirationDate);
        System.out.println("CVV: " + cvv);
        System.out.println("Name on card: " + nameOnCard);
    }
}
