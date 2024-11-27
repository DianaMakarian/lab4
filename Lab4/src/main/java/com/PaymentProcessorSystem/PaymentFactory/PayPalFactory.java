package com.PaymentProcessorSystem.PaymentFactory;

import com.PaymentProcessorSystem.PaymentMethod.PayPal;
import com.PaymentProcessorSystem.PaymentMethod.PaymentMethod;

public class PayPalFactory extends PaymentFactory {
    @Override
    public PaymentMethod createPayment() {
        return new PayPal();
    }
}
