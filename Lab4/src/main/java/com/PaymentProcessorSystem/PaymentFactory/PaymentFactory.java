package com.PaymentProcessorSystem.PaymentFactory;

import com.PaymentProcessorSystem.PaymentMethod.PaymentMethod;

public abstract class PaymentFactory {
    public abstract PaymentMethod createPayment();

    public void processPayment(double amount) {}
}
