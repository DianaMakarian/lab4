package com.PaymentProcessorSystem.PaymentFactory;

import com.PaymentProcessorSystem.PaymentMethod.PaymentMethod;

import java.util.HashMap;
import java.util.Map;

public class PaymentSimpleFactory {
    private PaymentFactory paymentFactory;

    public PaymentFactory createNewPayment(String paymentMethod, HashMap<String, String> details) {
        switch (paymentMethod) {
            case "CreditCard":
                paymentFactory = new CreditCardFactory();
            case "PayPal":
                paymentFactory = new PayPalFactory();
            case "BankTransfer":
                paymentFactory = new BankTransferFactory();
            default:
                return null;
        }
    }
}
