package com.PaymentProcessorSystem.PaymentFactory;

import com.PaymentProcessorSystem.PaymentMethod.BankTransfer;
import com.PaymentProcessorSystem.PaymentMethod.CreditCard;
import com.PaymentProcessorSystem.PaymentMethod.PayPal;
import com.PaymentProcessorSystem.PaymentMethod.PaymentMethod;

public class PaymentSimpleFactory {
    public PaymentFactory createNewPayment(String paymentMethod) {
        switch (paymentMethod) {
            case "CreditCard":
                return new CreditCardFactory();
            case "BankTransfer":
                return new BankTransferFactory();
            case "PayPal":
                return new PayPalFactory();
            default:
                throw new IllegalArgumentException("Invalid payment method: " + paymentMethod);
        }
    }
}
