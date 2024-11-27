package com.PaymentProcessorSystem.PaymentFactory;

import com.PaymentProcessorSystem.PaymentMethod.*;

import java.util.Map;

public class PaymentSimpleFactory {
    public static PaymentMethod createPayment(String paymentMethod, Map<String, String> details) {
        return switch (paymentMethod) {
            case "PayPal" -> new PayPal(details);
            case "CreditCard" -> new CreditCard(details);
            case "BankTransfer" -> new BankTransfer(details);
            default -> throw new IllegalArgumentException("Unknown payment method: " + paymentMethod);
        };
    }
}