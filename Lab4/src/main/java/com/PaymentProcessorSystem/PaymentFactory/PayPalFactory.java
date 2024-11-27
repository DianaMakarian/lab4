package com.PaymentProcessorSystem.PaymentFactory;

import com.PaymentProcessorSystem.PaymentMethod.PayPal;
import com.PaymentProcessorSystem.PaymentMethod.PaymentMethod;

import java.util.Map;

public class PayPalFactory extends PaymentFactory {
    @Override
    public PaymentMethod createPayment(Map<String, String> details) {
        return new PayPal(details);
    }
}

