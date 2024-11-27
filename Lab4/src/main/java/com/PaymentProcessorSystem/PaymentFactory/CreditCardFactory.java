package com.PaymentProcessorSystem.PaymentFactory;

import com.PaymentProcessorSystem.PaymentMethod.CreditCard;
import com.PaymentProcessorSystem.PaymentMethod.PaymentMethod;

import java.util.HashMap;

public class CreditCardFactory extends PaymentFactory {
    @Override
    public PaymentMethod createPayment(double amount, HashMap<String, String> details) {
        return new CreditCard(amount, details);
    }
}
