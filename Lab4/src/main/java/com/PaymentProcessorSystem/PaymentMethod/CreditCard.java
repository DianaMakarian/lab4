package com.PaymentProcessorSystem.PaymentMethod;

public class CreditCard implements PaymentMethod {
    private String cardNumber;
    private String expirationDate;
    private String cvv;
    private String nameOnCard;

    public CreditCard() {}

    public CreditCard(String cardNumber, String expirationDate, String cvv, String nameOnCard) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.nameOnCard = nameOnCard;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }

    @Override
    public void setDetails() {

    }
}
