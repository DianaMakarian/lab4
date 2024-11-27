package com.PaymentProcessorSystem.PaymentFactory;

import com.PaymentProcessorSystem.PaymentMethod.PaymentMethod;

import java.util.HashMap;

public abstract class PaymentFactory {
    public abstract PaymentMethod createPayment(double amount ,HashMap<String, String> details);
}
