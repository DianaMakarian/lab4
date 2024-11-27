package com.PaymentProcessorSystem.PaymentFactory;

import com.PaymentProcessorSystem.PaymentMethod.CreditCard;
import com.PaymentProcessorSystem.PaymentMethod.PaymentMethod;

public class CreditCardFactory extends PaymentFactory {
    @Override
    public PaymentMethod factoryMethod() {
        return new CreditCard();
    }
}
