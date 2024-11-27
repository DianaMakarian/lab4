package com.PaymentProcessorSystem.PaymentFactory;

import com.PaymentProcessorSystem.PaymentMethod.PayPal;
import com.PaymentProcessorSystem.PaymentMethod.PaymentMethod;

import java.util.HashMap;

public class PayPalFactory extends PaymentFactory {
    public PaymentMethod createPayment(double amount, HashMap<String, String> details) {
        return new PayPal(amount, details);
    }
}
