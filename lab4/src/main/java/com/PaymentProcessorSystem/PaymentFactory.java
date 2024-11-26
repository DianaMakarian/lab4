package com.PaymentProcessorSystem;

public class PaymentFactory {

    public PaymentMethod createNewPayment(String paymentMethod) {
        switch (paymentMethod) {
            case "CreditCard":
                return new CreditCard();
            case "BankTransfer":
                return new BankTransfer();
            case "PayPal":
                return new PayPal();
            default:
                throw new IllegalArgumentException("Invalid payment method: " + paymentMethod);
        }
    }
}
