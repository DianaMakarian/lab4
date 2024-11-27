package com.PaymentProcessorSystem.PaymentMethod;

import java.util.Map;

public class BankTransfer implements PaymentMethod {
    private String iban;
    private String paymentPurpose;

    public BankTransfer(Map<String, String> details) {
        this.iban = details.get("iban");
        this.paymentPurpose = details.get("paymentPurpose");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer payment of $" + amount);
        System.out.println("IBAN: " + iban);
    }
}
