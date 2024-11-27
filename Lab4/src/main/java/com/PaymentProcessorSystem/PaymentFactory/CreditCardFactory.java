package com.PaymentProcessorSystem.PaymentFactory;

import com.PaymentProcessorSystem.PaymentMethod.CreditCard;
import com.PaymentProcessorSystem.PaymentMethod.PaymentMethod;

import java.util.Map;

public class CreditCardFactory extends PaymentFactory {
    @Override
    public PaymentMethod createPayment(Map<String, String> details) {
        return new CreditCard(details);
    }
}
