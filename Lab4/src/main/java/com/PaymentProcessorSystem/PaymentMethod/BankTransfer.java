package com.PaymentProcessorSystem.PaymentMethod;

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
        System.out.println("Processing bank transfer payment of $" + amount);
    }

    @Override
    public void setDetails() {

    }
}
