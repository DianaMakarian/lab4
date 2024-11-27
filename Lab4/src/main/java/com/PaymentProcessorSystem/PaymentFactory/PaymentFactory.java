package com.PaymentProcessorSystem.PaymentFactory;

import com.PaymentProcessorSystem.PaymentMethod.PaymentMethod;

import java.util.Map;

public abstract class PaymentFactory {
    public abstract PaymentMethod createPayment(Map<String, String> details);
}

