package com.PaymentProcessorSystem.PaymentFactory;

import com.PaymentProcessorSystem.PaymentMethod.BankTransfer;
import com.PaymentProcessorSystem.PaymentMethod.PaymentMethod;

import java.util.HashMap;

public class BankTransferFactory extends PaymentFactory {
    @Override
    public PaymentMethod createPayment(double amount, HashMap<String,String> details) {
        return new BankTransfer(amount, details);
    }
}
