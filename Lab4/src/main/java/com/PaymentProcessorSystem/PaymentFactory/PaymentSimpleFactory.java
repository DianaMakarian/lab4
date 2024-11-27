package com.PaymentProcessorSystem.PaymentFactory;

import com.PaymentProcessorSystem.PaymentMethod.BankTransfer;
import com.PaymentProcessorSystem.PaymentMethod.CreditCard;
import com.PaymentProcessorSystem.PaymentMethod.PayPal;
import com.PaymentProcessorSystem.PaymentMethod.PaymentMethod;

public class PaymentSimpleFactory {
    public PaymentMethod createNewPayment(String paymentMethod) {
        switch (paymentMethod) {
            case "CreditCard":
                return new CreditCard();
            case "BankTransfer":
                return new BankTransfer();
            case "PayPal":
                return new PayPal();
            default:
                throw new IllegalArgumentException("Invalid payment method: " + paymentMethod);
        }
    }
}
