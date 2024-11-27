package com.PaymentProcessorSystem.PaymentMethod;

import java.util.HashMap;

public class BankTransfer implements PaymentMethod {
    private String iban;
    private String paymentPurpose;

    public BankTransfer(double amount, HashMap<String, String> details) {
        this.iban = details.get("iban");
        this.paymentPurpose = details.get("paymentPurpose");
        processPayment(amount);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer payment of $" + amount);
        System.out.println("IBAN: " + iban);
        System.out.println("Payment purpose: " + paymentPurpose);
    }
}
