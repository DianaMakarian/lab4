package com.PaymentProcessorSystem.PaymentFactory;

import com.PaymentProcessorSystem.PaymentMethod.BankTransfer;
import com.PaymentProcessorSystem.PaymentMethod.PaymentMethod;

import java.util.Map;

public class BankTransferFactory extends PaymentFactory {
    @Override
    public PaymentMethod createPayment(Map<String, String> details) {
        return new BankTransfer(details);
    }
}
