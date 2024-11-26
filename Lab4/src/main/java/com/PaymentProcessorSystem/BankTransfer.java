package com.PaymentProcessorSystem;

public class BankTransfer implements PaymentMethod {
    private String iban;
    private String paymentPurpose;

    public BankTransfer() {}

    public BankTransfer(String iban, String paymentPurpose) {
        this.iban = iban;
        this.paymentPurpose = paymentPurpose;
    }

    @Override
    public void processPayment(double amount) {
    }
}
