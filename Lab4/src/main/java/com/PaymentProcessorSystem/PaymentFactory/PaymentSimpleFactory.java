package com.PaymentProcessorSystem.PaymentFactory;

import com.PaymentProcessorSystem.PaymentMethod.PaymentMethod;

import java.util.Map;

public class PaymentSimpleFactory {
    private PaymentFactory paymentFactory;

    public PaymentFactory createNewPayment(String paymentMethod) {
        return switch (paymentMethod) {
            case "CreditCard" -> new CreditCardFactory();
            case "BankTransfer" -> new BankTransferFactory();
            case "PayPal" -> new PayPalFactory();
            default -> throw new IllegalArgumentException("Invalid payment method: " + paymentMethod);
        };
    }

    public void processPayment(String paymentMethod, double amount, Map<String, String> details) {
        this.paymentFactory = createNewPayment(paymentMethod);
        PaymentMethod payment = paymentFactory.createPayment();
        payment.setDetails(details);
        payment.processPayment(amount);
    }
}
