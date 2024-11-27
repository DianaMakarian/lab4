package com.PaymentProcessorSystem.PaymentFactory;

import com.PaymentProcessorSystem.PaymentMethod.BankTransfer;
import com.PaymentProcessorSystem.PaymentMethod.PaymentMethod;

public class BankTransferFactory extends PaymentFactory {
    @Override
    public PaymentMethod createPayment() {
        return new BankTransfer();
    }
}
